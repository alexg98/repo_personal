package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Set;


/**
 * SipProductosTipo generated by MyEclipse - Hibernate Tools
 */
public class SipProductosTipo extends AbstractSipProductosTipo implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipProductosTipo() {
    }

	/** minimal constructor */
    public SipProductosTipo(Long tipoCod, String tipoDesc) {
        super(tipoCod, tipoDesc);        
    }
    
    /** full constructor */
    public SipProductosTipo(Long tipoCod, String tipoDesc, Set sipProductoses) {
        super(tipoCod, tipoDesc, sipProductoses);        
    }
   
}
