package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractSipEps generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipEps  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 3205598719094420909L;
	private String epsCodigo;
     private String epsDescripcion;
     private Set sipDetalleReclamacioneses = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractSipEps() {
    }

	/** minimal constructor */
    public AbstractSipEps(String epsCodigo, String epsDescripcion) {
        this.epsCodigo = epsCodigo;
        this.epsDescripcion = epsDescripcion;
    }
    
    /** full constructor */
    public AbstractSipEps(String epsCodigo, String epsDescripcion, Set sipDetalleReclamacioneses) {
        this.epsCodigo = epsCodigo;
        this.epsDescripcion = epsDescripcion;
        this.sipDetalleReclamacioneses = sipDetalleReclamacioneses;
    }

   
    // Property accessors

    public String getEpsCodigo() {
        return this.epsCodigo;
    }
    
    public void setEpsCodigo(String epsCodigo) {
        this.epsCodigo = epsCodigo;
    }

    public String getEpsDescripcion() {
        return this.epsDescripcion;
    }
    
    public void setEpsDescripcion(String epsDescripcion) {
        this.epsDescripcion = epsDescripcion;
    }

    public Set getSipDetalleReclamacioneses() {
        return this.sipDetalleReclamacioneses;
    }
    
    public void setSipDetalleReclamacioneses(Set sipDetalleReclamacioneses) {
        this.sipDetalleReclamacioneses = sipDetalleReclamacioneses;
    }
   








}