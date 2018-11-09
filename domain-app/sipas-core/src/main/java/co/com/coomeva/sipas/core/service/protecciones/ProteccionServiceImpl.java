package co.com.coomeva.sipas.core.service.protecciones;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.coomeva.sipas.core.config.dto.parametros.ParamRegistroProtecciones;
import co.com.coomeva.sipas.core.dao.ISipProteccionesDao;
import co.com.coomeva.sipas.core.enums.EnumAcumulado;
import co.com.coomeva.sipas.core.factory.FactoryProxy;
import co.com.coomeva.sipas.core.model.sipasdb.ClimaeDetallado;
import co.com.coomeva.sipas.core.model.sipasdb.SipProtecciones;
import co.com.coomeva.sipas.core.model.sipasdb.SipProteccionesEventos;
import co.com.coomeva.sipas.core.protecciones.template.IProteccionTemplate;
import co.com.coomeva.sipas.util.annotations.EvictSession;
/**
 * Clase encargada de la administracion de las protecciones
 * @author alge3325
 * {@linkplain} https://coomeva.com.co/doumentacion/repositorio
 */
@Service
@Transactional(readOnly = true)
public class ProteccionServiceImpl implements ProteccionService{
	
	@Autowired
	ISipProteccionesDao dao;
	
	private IProteccionTemplate absTemplateProtec = null;
		
	@Override
	public void registrarIncremento() {
		
		
		Long asoNumint = 45454l;
		EnumAcumulado.ADICIONAL.getAcumuladoByAsociado(asoNumint); 
	
		
		List<SipProteccionesEventos> list = new ArrayList<>();
		list.add(new SipProteccionesEventos());
		list.get(0).setConsecutivo(99l);
		
		ParamRegistroProtecciones param = new ParamRegistroProtecciones();
		param.setProdCodigo(99l);
		param.setFechaNacimiento(new Date());
		param.setClimae(new ClimaeDetallado());
		param.getClimae().setFecCon(20140101l);
		param.getClimae().setFecNac("20140101");
		
		
		//--Registrar proteccion
		list.forEach( n -> {	
			//Ejecuta el proceso por cada producto
			absTemplateProtec = FactoryProxy.of( n.getConsecutivo().toString() ).getProteccionTemplate();
			absTemplateProtec.ejecutarIncremento(param);			
		});			
	}
	
	
	@Override
	@EvictSession
	public List<SipProtecciones> getProteccioneByAsonumint(Long asoNumint) {		
		return dao.findByProperty(ISipProteccionesDao.ASO_NUMINT , asoNumint);
	}
}
