package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Date;
import java.util.Set;


/**
 * SipFactura generated by MyEclipse - Hibernate Tools
 */
public class SipFactura extends AbstractSipFactura implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipFactura() {
    }

	/** minimal constructor */
    public SipFactura(SipFacturaId id) {
        super(id);        
    }
    
    /** full constructor */
    public SipFactura(SipFacturaId id, Date fechaGeneracion, Date fechaVencimiento, Set sipFacturaDetalles) {
        super(id, fechaGeneracion, fechaVencimiento, sipFacturaDetalles);        
    }
   
}