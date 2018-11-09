package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractSipFactura generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipFactura  implements java.io.Serializable {


    // Fields    

     private SipFacturaId id;
     private Date fechaGeneracion;
     private Date fechaVencimiento;
     private Set sipFacturaDetalles = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractSipFactura() {
    }

	/** minimal constructor */
    public AbstractSipFactura(SipFacturaId id) {
        this.id = id;
    }
    
    /** full constructor */
    public AbstractSipFactura(SipFacturaId id, Date fechaGeneracion, Date fechaVencimiento, Set sipFacturaDetalles) {
        this.id = id;
        this.fechaGeneracion = fechaGeneracion;
        this.fechaVencimiento = fechaVencimiento;
        this.sipFacturaDetalles = sipFacturaDetalles;
    }

   
    // Property accessors

    public SipFacturaId getId() {
        return this.id;
    }
    
    public void setId(SipFacturaId id) {
        this.id = id;
    }

    public Date getFechaGeneracion() {
        return this.fechaGeneracion;
    }
    
    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public Date getFechaVencimiento() {
        return this.fechaVencimiento;
    }
    
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Set getSipFacturaDetalles() {
        return this.sipFacturaDetalles;
    }
    
    public void setSipFacturaDetalles(Set sipFacturaDetalles) {
        this.sipFacturaDetalles = sipFacturaDetalles;
    }
   








}