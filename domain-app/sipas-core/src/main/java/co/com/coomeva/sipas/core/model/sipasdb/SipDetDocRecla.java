package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Date;


/**
 * SipDetDocRecla generated by MyEclipse - Hibernate Tools
 */
public class SipDetDocRecla extends AbstractSipDetDocRecla implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipDetDocRecla() {
    }

	/** minimal constructor */
    public SipDetDocRecla(SipDetDocReclaId id, SipDetalleDocumentosReq sipDetalleDocumentosReq, SipDetalleReclamaciones sipDetalleReclamaciones) {
        super(id, sipDetalleDocumentosReq, sipDetalleReclamaciones);        
    }
    
    /** full constructor */
    public SipDetDocRecla(SipDetDocReclaId id, SipDetalleDocumentosReq sipDetalleDocumentosReq, SipDetalleReclamaciones sipDetalleReclamaciones, Date detDocFechaEntrega, String detDocObservaciones, String detDocBenMenorEdad, String detDocBenMenorPadresVivos) {
        super(id, sipDetalleDocumentosReq, sipDetalleReclamaciones, detDocFechaEntrega, detDocObservaciones,detDocBenMenorEdad, detDocBenMenorPadresVivos);        
    }
   
}
