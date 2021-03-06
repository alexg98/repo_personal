package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Date;


/**
 * SipFacInactividad generated by MyEclipse - Hibernate Tools
 */
public class SipFacInactividad extends AbstractSipFacInactividad implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipFacInactividad() {
    }

	/** minimal constructor */
    public SipFacInactividad(Long inaCod, Long periodo, Date fechaIni, Date fechaFin, String codEstado, Date fechaRegistro) {
        super(inaCod, periodo, fechaIni, fechaFin, codEstado, fechaRegistro);        
    }
    
    /** full constructor */
    public SipFacInactividad(Long inaCod, SipProteccionesEventos sipProteccionesEventos, Long periodo, Date fechaIni, Date fechaFin, String codEstado, Date fechaRegistro) {
        super(inaCod, sipProteccionesEventos, periodo, fechaIni, fechaFin, codEstado, fechaRegistro);        
    }
   
}
