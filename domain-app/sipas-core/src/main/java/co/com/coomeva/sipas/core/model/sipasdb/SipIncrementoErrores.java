package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Date;


/**
 * SipIncrementoErrores generated by MyEclipse - Hibernate Tools
 */
public class SipIncrementoErrores extends AbstractSipIncrementoErrores implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipIncrementoErrores() {
    }

	/** minimal constructor */
    public SipIncrementoErrores(Long errCodigo, SipIncrementoAnual sipIncrementoAnual, SipProteccionesEventos sipProteccionesEventos) {
        super(errCodigo, sipIncrementoAnual, sipProteccionesEventos);        
    }
    
    /** full constructor */
    public SipIncrementoErrores(Long errCodigo, SipIncrementoAnual sipIncrementoAnual, SipProteccionesEventos sipProteccionesEventos, String descripcion, Date fechaRegistro) {
        super(errCodigo, sipIncrementoAnual, sipProteccionesEventos, descripcion, fechaRegistro);        
    }
   
}
