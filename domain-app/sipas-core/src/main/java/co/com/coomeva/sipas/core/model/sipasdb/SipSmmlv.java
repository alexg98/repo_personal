package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Date;


/**
 * SipSmmlv generated by MyEclipse - Hibernate Tools
 */
public class SipSmmlv extends AbstractSipSmmlv implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipSmmlv() {
    }

	/** minimal constructor */
    public SipSmmlv(Long codigo, Double smmlv, Date fechaFin) {
        super(codigo, smmlv, fechaFin);        
    }
    
    /** full constructor */
    public SipSmmlv(Long codigo, Double smmlv, String descripcion, Date fechaIni, Date fechaFin) {
        super(codigo, smmlv, descripcion, fechaIni, fechaFin);        
    }
   
}
