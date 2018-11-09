package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractSipNombresComerciales generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipNombresComerciales  implements java.io.Serializable {


    // Fields    

     private Long comCodigo;
     private String comNombre;
     private String comDesc;
     private Set sipProteccioneses = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractSipNombresComerciales() {
    }

	/** minimal constructor */
    public AbstractSipNombresComerciales(Long comCodigo) {
        this.comCodigo = comCodigo;
    }
    
    /** full constructor */
    public AbstractSipNombresComerciales(Long comCodigo, String comNombre, String comDesc, Set sipProteccioneses) {
        this.comCodigo = comCodigo;
        this.comNombre = comNombre;
        this.comDesc = comDesc;
        this.sipProteccioneses = sipProteccioneses;
    }

   
    // Property accessors

    public Long getComCodigo() {
        return this.comCodigo;
    }
    
    public void setComCodigo(Long comCodigo) {
        this.comCodigo = comCodigo;
    }

    public String getComNombre() {
        return this.comNombre;
    }
    
    public void setComNombre(String comNombre) {
        this.comNombre = comNombre;
    }

    public String getComDesc() {
        return this.comDesc;
    }
    
    public void setComDesc(String comDesc) {
        this.comDesc = comDesc;
    }

    public Set getSipProteccioneses() {
        return this.sipProteccioneses;
    }
    
    public void setSipProteccioneses(Set sipProteccioneses) {
        this.sipProteccioneses = sipProteccioneses;
    }
   








}