package co.com.coomeva.sipas.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.coomeva.sipas.api.controller.HandlerException.ExceptionHandlingController;
import co.com.coomeva.sipas.core.model.sipasdb.SipProtecciones;
import co.com.coomeva.sipas.core.service.protecciones.ProteccionService;

@RestController
@RequestMapping(value="/protecciones")
public class ProteccionesController extends ExceptionHandlingController{

	@Autowired
	ProteccionService proteccionesService;
	
	@RequestMapping(value ="/list/{asociado}", method = RequestMethod.GET)
	public String getProteccionesByAsonumint(@PathVariable("asociado") Long asociado) {
		List<SipProtecciones> sipProtecciones = proteccionesService.getProteccioneByAsonumint(asociado);
		return sipProtecciones.toString();	
	}
	
	public String getProteccionesByAsonumint2(@PathVariable("assignee") Long asociado) {		
		proteccionesService.registrarIncremento();
		return "Acceso metodo publico";
	}
	
	@RequestMapping(value ="/add", method = RequestMethod.GET)
	public String registrarProteccion() {
		proteccionesService.registrarIncremento();		
		return null;
	}
}
