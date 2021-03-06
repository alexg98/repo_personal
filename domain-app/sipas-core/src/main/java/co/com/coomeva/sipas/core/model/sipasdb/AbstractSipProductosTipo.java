package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractSipProductosTipo generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipProductosTipo  implements java.io.Serializable {


    // Fields    

     private Long tipoCod;
     private String tipoDesc;
     private Set sipProductoses = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractSipProductosTipo() {
    }

	/** minimal constructor */
    public AbstractSipProductosTipo(Long tipoCod, String tipoDesc) {
        this.tipoCod = tipoCod;
        this.tipoDesc = tipoDesc;
    }
    
    /** full constructor */
    public AbstractSipProductosTipo(Long tipoCod, String tipoDesc, Set sipProductoses) {
        this.tipoCod = tipoCod;
        this.tipoDesc = tipoDesc;
        this.sipProductoses = sipProductoses;
    }

   
    // Property accessors

    public Long getTipoCod() {
        return this.tipoCod;
    }
    
    public void setTipoCod(Long tipoCod) {
        this.tipoCod = tipoCod;
    }

    public String getTipoDesc() {
        return this.tipoDesc;
    }
    
    public void setTipoDesc(String tipoDesc) {
        this.tipoDesc = tipoDesc;
    }

    public Set getSipProductoses() {
        return this.sipProductoses;
    }
    
    public void setSipProductoses(Set sipProductoses) {
        this.sipProductoses = sipProductoses;
    }
   








}