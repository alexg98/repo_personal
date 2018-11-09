package co.com.coomeva.sipas.core.validaciones.protecciones;

import static co.com.coomeva.sipas.core.enums.EnumProductos.VIDA_CLASICO;

import java.util.function.Consumer;

import org.springframework.stereotype.Component;

import co.com.coomeva.sipas.core.config.dto.parametros.ParamRegistroProtecciones;
import co.com.coomeva.sipas.util.excepciones.RuntimeExceptionSipas;
/**
 * @ Validaciones generales requeridas para la grabacion de un producto.
 * @author alge3325
 *
 */          
@Component("validador_99")
public class ValidadorVidaClasica implements ValidadorProtecciones {
	
	Consumer<ParamRegistroProtecciones> validarEstadoAsociado = (param) -> param.getClimae();
	
	Consumer<ParamRegistroProtecciones> validarProteccionesPendientesAprobacion = (param) -> 
		RepositorioValidaciones.of(param).validarProteccionesPendientesAprobacion(VIDA_CLASICO.getProdCodigo());
			
	/**
	 * Valida las condiciones necesarias para la grabacion de una proteccion, como primera instancia se 
	 * invocan las validaciones generales parametrizadas en la interfaz ValidadorProtecciones
	 * @param  ParamRegistroProtecciones param
	 */
	@Override
	public void validaCondicionesDeRegistro(ParamRegistroProtecciones param) {
		ValidadorProtecciones.super.validaCondicionesDeRegistro(param);
		validarProteccionesPendientesAprobacion.accept(param);
		validarEstadoAsociado.accept(param);		
	}

	@Override
	public void validaCondicionesDisminucion(ParamRegistroProtecciones param) {
		ValidadorProtecciones.super.validaCondicionesDisminucion(param);
		throw new RuntimeExceptionSipas("Metodo no soportado");
	}	
}