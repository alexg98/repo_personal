package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;


/**
 * AbstractSipNovedades generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipNovedades  implements java.io.Serializable {


    // Fields    

     private SipNovedadesId id;
     private SipNovedadesTipo sipNovedadesTipo;
     private Long novAsoNumint;
     private Date novFechaProceso;
     private String novDatoAnterior;
     private String novDatoNuevo;
     private String novEstado;
     private String novUsuario;
     private Date novFechaRegistro;
     private String novObservacion;
     private Long novMotivo;


    // Constructors


	public String getNovObservacion() {
		return novObservacion;
	}

	public void setNovObservacion(String novObservacion) {
		this.novObservacion = novObservacion;
	}

	/** default constructor */
    public AbstractSipNovedades() {
    }

	/** minimal constructor */
    public AbstractSipNovedades(SipNovedadesId id, SipNovedadesTipo sipNovedadesTipo) {
        this.id = id;
        this.sipNovedadesTipo = sipNovedadesTipo;
    }
    
    /** full constructor */
    public AbstractSipNovedades(SipNovedadesId id, SipNovedadesTipo sipNovedadesTipo, Long novAsoNumint, Date novFechaProceso, String novDatoAnterior, String novDatoNuevo, String novEstado, String novUsuario, Date novFechaRegistro,Long novMotivo) {
        this.id = id;
        this.sipNovedadesTipo = sipNovedadesTipo;
        this.novAsoNumint = novAsoNumint;
        this.novFechaProceso = novFechaProceso;
        this.novDatoAnterior = novDatoAnterior;
        this.novDatoNuevo = novDatoNuevo;
        this.novEstado = novEstado;
        this.novUsuario = novUsuario;
        this.novFechaRegistro = novFechaRegistro;
        this.novMotivo=novMotivo;
    }

   
    // Property accessors

    public SipNovedadesId getId() {
        return this.id;
    }
    
    public void setId(SipNovedadesId id) {
        this.id = id;
    }

    public SipNovedadesTipo getSipNovedadesTipo() {
        return this.sipNovedadesTipo;
    }
    
    public void setSipNovedadesTipo(SipNovedadesTipo sipNovedadesTipo) {
        this.sipNovedadesTipo = sipNovedadesTipo;
    }

    public Long getNovAsoNumint() {
        return this.novAsoNumint;
    }
    
    public void setNovAsoNumint(Long novAsoNumint) {
        this.novAsoNumint = novAsoNumint;
    }

    public Date getNovFechaProceso() {
        return this.novFechaProceso;
    }
    
    public void setNovFechaProceso(Date novFechaProceso) {
        this.novFechaProceso = novFechaProceso;
    }

    public String getNovDatoAnterior() {
        return this.novDatoAnterior;
    }
    
    public void setNovDatoAnterior(String novDatoAnterior) {
        this.novDatoAnterior = novDatoAnterior;
    }

    public String getNovDatoNuevo() {
        return this.novDatoNuevo;
    }
    
    public void setNovDatoNuevo(String novDatoNuevo) {
        this.novDatoNuevo = novDatoNuevo;
    }

    public String getNovEstado() {
        return this.novEstado;
    }
    
    public void setNovEstado(String novEstado) {
        this.novEstado = novEstado;
    }

    public String getNovUsuario() {
        return this.novUsuario;
    }
    
    public void setNovUsuario(String novUsuario) {
        this.novUsuario = novUsuario;
    }

    public Date getNovFechaRegistro() {
        return this.novFechaRegistro;
    }
    
    public void setNovFechaRegistro(Date novFechaRegistro) {
        this.novFechaRegistro = novFechaRegistro;
    }

	public void setNovMotivo(Long novMotivo) {
		this.novMotivo = novMotivo;
	}

	public Long getNovMotivo() {
		return novMotivo;
	}
   








}