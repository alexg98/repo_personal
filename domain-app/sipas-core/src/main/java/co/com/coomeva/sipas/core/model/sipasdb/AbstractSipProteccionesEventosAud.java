package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;


/**
 * AbstractSipProteccionesEventosAud generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipProteccionesEventosAud  implements java.io.Serializable {


    // Fields    

     private Long consecutivoAud;
     private Long consecutivo;
     private Long proCod;
     private Long factorCodigo;
     private Long codigo;
     private Double proValor;
     private Long proCuota;
     private Double proValorSolicitado;
     private String proObservacion;
     private Date proFechaRegistro;
     private Date proFechaSolicitud;
     private Date proFechaRequisitos;
     private Date proFechaPrimeraContribucion;
     private Date proFechaVigencia;
     private String proVigente;
     private Long proPromotor;
     private String proUsuario;
     private String proEstadoProteccion;
     private String proEstado;
     private Date fechaRegistro;
     private Date proFechaAprobacion;
     private Double factorValor;
     private Double proValorAnt;
     private Long proCuotaAnt;
     private Long ano;
     private String proTipo;
     private Long promConsecutivo;
     private String proCanal;
     private Long proFlujo;
     private String proMotivo;
     private Long proConsecutivo;
     private Long proTipAnulacion;   
     private String proUsuarioError;
     private Long proCuotaDescuento;   
     private Double proPorcentajeDescuento;
     
    // Constructors

	/** default constructor */
    public AbstractSipProteccionesEventosAud() {
    }

	/** minimal constructor */
    public AbstractSipProteccionesEventosAud(Long consecutivoAud, Long consecutivo, Date proFechaRegistro, String proEstado) {
        this.consecutivoAud = consecutivoAud;
        this.consecutivo = consecutivo;
        this.proFechaRegistro = proFechaRegistro;
        this.proEstado = proEstado;
    }
    
    /** full constructor */
    public AbstractSipProteccionesEventosAud(Long consecutivoAud, Long consecutivo, Long proCod, Long factorCodigo, Long codigo, Double proValor, Long proCuota, Double proValorSolicitado, String proObservacion, Date proFechaRegistro, Date proFechaSolicitud, Date proFechaRequisitos, Date proFechaPrimeraContribucion, Date proFechaVigencia, String proVigente, Long proPromotor, String proUsuario, String proEstadoProteccion, String proEstado, Date fechaRegistro, Long consAudAfectado, Date proFechaAprobacion, Double factorValor, Date fechaHistoria, Double proValorAnt, Long proCuotaAnt, Long ano, String proTipo, Long promConsecutivo,String proCanal, Long proFlujo, String proMotivo, Long proConsecutivo,Long proTipAnulacion,String proUsuarioError) {
        this.consecutivoAud = consecutivoAud;
        this.consecutivo = consecutivo;
        this.proCod = proCod;
        this.factorCodigo = factorCodigo;
        this.codigo = codigo;
        this.proValor = proValor;
        this.proCuota = proCuota;
        this.proValorSolicitado = proValorSolicitado;
        this.proObservacion = proObservacion;
        this.proFechaRegistro = proFechaRegistro;
        this.proFechaSolicitud = proFechaSolicitud;
        this.proFechaRequisitos = proFechaRequisitos;
        this.proFechaPrimeraContribucion = proFechaPrimeraContribucion;
        this.proFechaVigencia = proFechaVigencia;
        this.proVigente = proVigente;
        this.proPromotor = proPromotor;
        this.proUsuario = proUsuario;
        this.proEstadoProteccion = proEstadoProteccion;
        this.proEstado = proEstado;
        this.fechaRegistro = fechaRegistro;
        this.proFechaAprobacion = proFechaAprobacion;
        this.factorValor = factorValor;
        this.proValorAnt = proValorAnt;
        this.proCuotaAnt = proCuotaAnt;
        this.ano = ano;
        this.proTipo = proTipo;
        this.promConsecutivo = promConsecutivo;
        this.proCanal = proCanal;
        this.proFlujo = proFlujo;
        this.proMotivo = proMotivo;
        this.proConsecutivo = proConsecutivo;
        this.proTipAnulacion=proTipAnulacion;
        this.proUsuarioError=proUsuarioError;
    }

   
    // Property accessors

    public Long getConsecutivoAud() {
        return this.consecutivoAud;
    }
    
    public void setConsecutivoAud(Long consecutivoAud) {
        this.consecutivoAud = consecutivoAud;
    }

    public Long getConsecutivo() {
        return this.consecutivo;
    }
    
    public void setConsecutivo(Long consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Long getProCod() {
        return this.proCod;
    }
    
    public void setProCod(Long proCod) {
        this.proCod = proCod;
    }

    public Long getFactorCodigo() {
        return this.factorCodigo;
    }
    
    public void setFactorCodigo(Long factorCodigo) {
        this.factorCodigo = factorCodigo;
    }

    public Long getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Double getProValor() {
        return this.proValor;
    }
    
    public void setProValor(Double proValor) {
        this.proValor = proValor;
    }

    public Long getProCuota() {
        return this.proCuota;
    }
    
    public void setProCuota(Long proCuota) {
        this.proCuota = proCuota;
    }

    public Double getProValorSolicitado() {
        return this.proValorSolicitado;
    }
    
    public void setProValorSolicitado(Double proValorSolicitado) {
        this.proValorSolicitado = proValorSolicitado;
    }

    public String getProObservacion() {
        return this.proObservacion;
    }
    
    public void setProObservacion(String proObservacion) {
        this.proObservacion = proObservacion;
    }

    public Date getProFechaRegistro() {
        return this.proFechaRegistro;
    }
    
    public void setProFechaRegistro(Date proFechaRegistro) {
        this.proFechaRegistro = proFechaRegistro;
    }

    public Date getProFechaSolicitud() {
        return this.proFechaSolicitud;
    }
    
    public void setProFechaSolicitud(Date proFechaSolicitud) {
        this.proFechaSolicitud = proFechaSolicitud;
    }

    public Date getProFechaRequisitos() {
        return this.proFechaRequisitos;
    }
    
    public void setProFechaRequisitos(Date proFechaRequisitos) {
        this.proFechaRequisitos = proFechaRequisitos;
    }

    public Date getProFechaPrimeraContribucion() {
        return this.proFechaPrimeraContribucion;
    }
    
    public void setProFechaPrimeraContribucion(Date proFechaPrimeraContribucion) {
        this.proFechaPrimeraContribucion = proFechaPrimeraContribucion;
    }

    public Date getProFechaVigencia() {
        return this.proFechaVigencia;
    }
    
    public void setProFechaVigencia(Date proFechaVigencia) {
        this.proFechaVigencia = proFechaVigencia;
    }

    public String getProVigente() {
        return this.proVigente;
    }
    
    public void setProVigente(String proVigente) {
        this.proVigente = proVigente;
    }

    public Long getProPromotor() {
        return this.proPromotor;
    }
    
    public void setProPromotor(Long proPromotor) {
        this.proPromotor = proPromotor;
    }

    public String getProUsuario() {
        return this.proUsuario;
    }
    
    public void setProUsuario(String proUsuario) {
        this.proUsuario = proUsuario;
    }

    public String getProEstadoProteccion() {
        return this.proEstadoProteccion;
    }
    
    public void setProEstadoProteccion(String proEstadoProteccion) {
        this.proEstadoProteccion = proEstadoProteccion;
    }

    public String getProEstado() {
        return this.proEstado;
    }
    
    public void setProEstado(String proEstado) {
        this.proEstado = proEstado;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getProFechaAprobacion() {
        return this.proFechaAprobacion;
    }
    
    public void setProFechaAprobacion(Date proFechaAprobacion) {
        this.proFechaAprobacion = proFechaAprobacion;
    }

    public Double getFactorValor() {
        return this.factorValor;
    }
    
    public void setFactorValor(Double factorValor) {
        this.factorValor = factorValor;
    }

    public Double getProValorAnt() {
        return this.proValorAnt;
    }
    
    public void setProValorAnt(Double proValorAnt) {
        this.proValorAnt = proValorAnt;
    }

    public Long getProCuotaAnt() {
        return this.proCuotaAnt;
    }
    
    public void setProCuotaAnt(Long proCuotaAnt) {
        this.proCuotaAnt = proCuotaAnt;
    }

	public Long getAno() {
		return ano;
	}

	public void setAno(Long ano) {
		this.ano = ano;
	}
   
	public Long getPromConsecutivo() {
		return promConsecutivo;
	}

	public void setPromConsecutivo(Long promConsecutivo) {
		this.promConsecutivo = promConsecutivo;
	}

	public String getProTipo() {
		return proTipo;
	}

	public void setProTipo(String proTipo) {
		this.proTipo = proTipo;
	}
	public String getProCanal() {
		return proCanal;
	}

	public void setProCanal(String proCanal) {
		this.proCanal = proCanal;
	}

	public Long getProFlujo() {
		return proFlujo;
	}

	public void setProFlujo(Long proFlujo) {
		this.proFlujo = proFlujo;
	}

	public String getProMotivo() {
		return proMotivo;
	}

	public void setProMotivo(String proMotivo) {
		this.proMotivo = proMotivo;
	}

	public Long getProConsecutivo() {
		return proConsecutivo;
	}

	public void setProConsecutivo(Long proConsecutivo) {
		this.proConsecutivo = proConsecutivo;
	}

	public Long getProTipAnulacion() {
		return proTipAnulacion;
	}

	public void setProTipAnulacion(Long proTipAnulacion) {
		this.proTipAnulacion = proTipAnulacion;
	}
	public String getProUsuarioError() {
		return proUsuarioError;
	}

	public void setProUsuarioError(String proUsuarioError) {
		this.proUsuarioError = proUsuarioError;
	}

	public Long getProCuotaDescuento() {
		return proCuotaDescuento;
	}

	public void setProCuotaDescuento(Long proCuotaDescuento) {
		this.proCuotaDescuento = proCuotaDescuento;
	}

	public void setProPorcentajeDescuento(Double proPorcentajeDescuento) {
		this.proPorcentajeDescuento = proPorcentajeDescuento;
	}

	public Double getProPorcentajeDescuento() {
		return proPorcentajeDescuento;
	}
}