package co.com.coomeva.sipas.util.excepciones;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public final class ExceptionsSipasUtils {

	public static synchronized String getTraced(Error erro) {
		return getTracedToList(erro.getStackTrace()).toString();
	}
	
	public static synchronized String getTraced(Exception erro) {			
		return getTracedToList(erro.getStackTrace()).toString();
	}
	
	public static synchronized List<String> getTracedToList(StackTraceElement[] erro) {			
		return Arrays.stream(erro).filter( s -> s.getClassName().contains("co.com.coomeva")  ).				
				map( n -> n.getClassName() + "."+n.getMethodName()+ "(Line "+n.getLineNumber()+")").				
				collect(Collectors.toList());
	}
	
	public static synchronized Optional<StackTraceElement> getLastTrace(StackTraceElement[] erro) {			
		return Arrays.stream(erro).filter( s -> s.getClassName().contains("co.com.coomeva") ).findFirst();				
	}
	/**
	 * Devuelve la excepcion raiz desde la logica de negocio
	 * @param erro
	 * @return
	 */
	public static synchronized String getRootTrace(Exception exception) {	
		Optional<StackTraceElement> traceerror = getLastTrace(exception.getStackTrace());
		return traceerror.map( trace -> exception.getClass().getName() + ": " +exception.getMessage() +"  " 
				+ trace.getClassName()+"."+trace.getMethodName()+" Line ("+trace.getLineNumber() +")").
				orElse("Error capturando Excepcion");
	}
}
