package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractSipBeneficiariosTipo generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipBeneficiariosTipo  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -2339887851259307085L;
	private String tipoCod;
     private String descripcion;
     private String nombreCorto;
     private String estado;
     private Set<SipBeneficiariosAsociado> sipBeneficiariosAsociados = new HashSet<>(0);


    // Constructors

    /** default constructor */
    public AbstractSipBeneficiariosTipo() {
    }

	/** minimal constructor */
    public AbstractSipBeneficiariosTipo(String tipoCod, String nombreCorto, String estado) {
        this.tipoCod = tipoCod;
        this.nombreCorto = nombreCorto;
        this.estado = estado;
    }
    
    /** full constructor */
    public AbstractSipBeneficiariosTipo(String tipoCod, String descripcion, String nombreCorto, String estado, Set<SipBeneficiariosAsociado> sipBeneficiariosAsociados) {
        this.tipoCod = tipoCod;
        this.descripcion = descripcion;
        this.nombreCorto = nombreCorto;
        this.estado = estado;
        this.sipBeneficiariosAsociados = sipBeneficiariosAsociados;
    }

   
    // Property accessors

    public String getTipoCod() {
        return this.tipoCod;
    }
    
    public void setTipoCod(String tipoCod) {
        this.tipoCod = tipoCod;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreCorto() {
        return this.nombreCorto;
    }
    
    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Set<SipBeneficiariosAsociado> getSipBeneficiariosAsociados() {
        return this.sipBeneficiariosAsociados;
    }
    
    public void setSipBeneficiariosAsociados(Set<SipBeneficiariosAsociado> sipBeneficiariosAsociados) {
        this.sipBeneficiariosAsociados = sipBeneficiariosAsociados;
    }
}