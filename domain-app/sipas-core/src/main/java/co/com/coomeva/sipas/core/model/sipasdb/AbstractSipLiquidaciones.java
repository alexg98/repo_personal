package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractSipLiquidaciones generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipLiquidaciones  implements java.io.Serializable {


    // Fields    

     private Long liqPagConsecutivo;
     private SipLiquidaciones sipLiquidaciones;
     private Long liqPagAsonumint;
     private Date liqPagoFechaCreacion;
     private Date liqPagFechaAprob;
     private Double liqPagValorRetefuente;
     private Long liqPagValorBase;
     private Long liqPagDescuentosCart;
     private String liqPagPagoCuotaMes;
     private Long liqPagValorCuotaMes;
     private Long liqPagNetoPago;
     private Long liqPagoFormaPago;
     private Long liqPagoEstado;
     private String liqPagoOficinaCobro;
     private Long liqPagoAgenciaCobro;
     private String liqPagoObservaciones;
     private Long liqPagValorProteccion;
     private Long liqPagValorCapitalizado;
     private Long liqPagNumCtaDep;
     private String liqPagTipoFraccionamiento;
     private Long liqPagDescVar;
     private Long liqPagPagarA;
     private String liqTipDistribucion;
     private Long liqPagExcDist;
     private Long liqPagRetefuente;
     private String liqPagDescuentoSaldos;
     private Long liqPagUsuarioDescuento;
     private Long liqPagTipoDeduccion;
     private Long liqPagValorDeduccion;
     
     private String liqPagTipoCuenta;
     private Long liqPagCodBanco;
     private String liqPagDireccionBeneficiario;
     private String liqPagCorreoeBeneficiario;
     private String liqPagCodSucursal;
     private String liqPagCodActividadEco;
     
     private String liqPagAgenciaCredito;
     private String liqPagLineaCredito;
     private String liqPagNumeroPagare;
     private String liqPagTipoAbono;
     
     private String liqCuentaDepositoAp;
     
     
     private Set sipPlanDePagoses = new HashSet(0);
     private Set sipLiquidacioneses = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractSipLiquidaciones() {
    }

	/** minimal constructor */
    public AbstractSipLiquidaciones(Long liqPagConsecutivo, Long liqPagAsonumint, Date liqPagoFechaCreacion, Long liqPagValorBase, Long liqPagNetoPago, Long liqPagoEstado) {
        this.liqPagConsecutivo = liqPagConsecutivo;
        this.liqPagAsonumint = liqPagAsonumint;
        this.liqPagoFechaCreacion = liqPagoFechaCreacion;
        this.liqPagValorBase = liqPagValorBase;
        this.liqPagNetoPago = liqPagNetoPago;
        this.liqPagoEstado = liqPagoEstado;
    }
    
    /** full constructor */
    public AbstractSipLiquidaciones(Long liqPagConsecutivo, SipLiquidaciones sipLiquidaciones, Long liqPagAsonumint, Date liqPagoFechaCreacion, Date liqPagFechaAprob, Double liqPagValorRetefuente, Long liqPagValorBase, Long liqPagDescuentosCart, String liqPagPagoCuotaMes, Long liqPagValorCuotaMes, Long liqPagNetoPago, Long liqPagoFormaPago, Long liqPagoEstado, String liqPagoOficinaCobro, Long liqPagoAgenciaCobro, String liqPagoObservaciones, Long liqPagValorProteccion, Long liqPagValorCapitalizado, Long liqPagNumCtaDep, String liqPagTipoFraccionamiento, Long liqPagDescVar, Long liqPagPagarA, String liqTipDistribucion, Long liqPagExcDist, Long liqPagRetefuente, String liqPagDescuentoSaldos, Long liqPagUsuarioDescuento, Long liqPagTipoDeduccion, Long liqPagValorDeduccion, Set sipPlanDePagoses, Set sipLiquidacioneses) {
        this.liqPagConsecutivo = liqPagConsecutivo;
        this.sipLiquidaciones = sipLiquidaciones;
        this.liqPagAsonumint = liqPagAsonumint;
        this.liqPagoFechaCreacion = liqPagoFechaCreacion;
        this.liqPagFechaAprob = liqPagFechaAprob;
        this.liqPagValorRetefuente = liqPagValorRetefuente;
        this.liqPagValorBase = liqPagValorBase;
        this.liqPagDescuentosCart = liqPagDescuentosCart;
        this.liqPagPagoCuotaMes = liqPagPagoCuotaMes;
        this.liqPagValorCuotaMes = liqPagValorCuotaMes;
        this.liqPagNetoPago = liqPagNetoPago;
        this.liqPagoFormaPago = liqPagoFormaPago;
        this.liqPagoEstado = liqPagoEstado;
        this.liqPagoOficinaCobro = liqPagoOficinaCobro;
        this.liqPagoAgenciaCobro = liqPagoAgenciaCobro;
        this.liqPagoObservaciones = liqPagoObservaciones;
        this.liqPagValorProteccion = liqPagValorProteccion;
        this.liqPagValorCapitalizado = liqPagValorCapitalizado;
        this.liqPagNumCtaDep = liqPagNumCtaDep;
        this.liqPagTipoFraccionamiento = liqPagTipoFraccionamiento;
        this.liqPagDescVar = liqPagDescVar;
        this.liqPagPagarA = liqPagPagarA;
        this.liqTipDistribucion = liqTipDistribucion;
        this.liqPagExcDist = liqPagExcDist;
        this.liqPagRetefuente = liqPagRetefuente;
        this.liqPagDescuentoSaldos = liqPagDescuentoSaldos;
        this.liqPagUsuarioDescuento = liqPagUsuarioDescuento; 
        this.liqPagTipoDeduccion = liqPagTipoDeduccion;
        this.liqPagValorDeduccion = liqPagValorDeduccion;
        this.sipPlanDePagoses = sipPlanDePagoses;
        this.sipLiquidacioneses = sipLiquidacioneses;
    }

   
    // Property accessors

    public Long getLiqPagConsecutivo() {
        return this.liqPagConsecutivo;
    }
    
    public void setLiqPagConsecutivo(Long liqPagConsecutivo) {
        this.liqPagConsecutivo = liqPagConsecutivo;
    }

    public SipLiquidaciones getSipLiquidaciones() {
        return this.sipLiquidaciones;
    }
    
    public void setSipLiquidaciones(SipLiquidaciones sipLiquidaciones) {
        this.sipLiquidaciones = sipLiquidaciones;
    }

    public Long getLiqPagAsonumint() {
        return this.liqPagAsonumint;
    }
    
    public void setLiqPagAsonumint(Long liqPagAsonumint) {
        this.liqPagAsonumint = liqPagAsonumint;
    }

    public Date getLiqPagoFechaCreacion() {
        return this.liqPagoFechaCreacion;
    }
    
    public void setLiqPagoFechaCreacion(Date liqPagoFechaCreacion) {
        this.liqPagoFechaCreacion = liqPagoFechaCreacion;
    }

    public Date getLiqPagFechaAprob() {
        return this.liqPagFechaAprob;
    }
    
    public void setLiqPagFechaAprob(Date liqPagFechaAprob) {
        this.liqPagFechaAprob = liqPagFechaAprob;
    }

    public Double getLiqPagValorRetefuente() {
        return this.liqPagValorRetefuente;
    }
    
    public void setLiqPagValorRetefuente(Double liqPagValorRetefuente) {
        this.liqPagValorRetefuente = liqPagValorRetefuente;
    }

    public Long getLiqPagValorBase() {
        return this.liqPagValorBase;
    }
    
    public void setLiqPagValorBase(Long liqPagValorBase) {
        this.liqPagValorBase = liqPagValorBase;
    }

    public Long getLiqPagDescuentosCart() {
        return this.liqPagDescuentosCart;
    }
    
    public void setLiqPagDescuentosCart(Long liqPagDescuentosCart) {
        this.liqPagDescuentosCart = liqPagDescuentosCart;
    }

    public String getLiqPagPagoCuotaMes() {
        return this.liqPagPagoCuotaMes;
    }
    
    public void setLiqPagPagoCuotaMes(String liqPagPagoCuotaMes) {
        this.liqPagPagoCuotaMes = liqPagPagoCuotaMes;
    }

    public Long getLiqPagValorCuotaMes() {
        return this.liqPagValorCuotaMes;
    }
    
    public void setLiqPagValorCuotaMes(Long liqPagValorCuotaMes) {
        this.liqPagValorCuotaMes = liqPagValorCuotaMes;
    }

    public Long getLiqPagNetoPago() {
        return this.liqPagNetoPago;
    }
    
    public void setLiqPagNetoPago(Long liqPagNetoPago) {
        this.liqPagNetoPago = liqPagNetoPago;
    }

    public Long getLiqPagoFormaPago() {
        return this.liqPagoFormaPago;
    }
    
    public void setLiqPagoFormaPago(Long liqPagoFormaPago) {
        this.liqPagoFormaPago = liqPagoFormaPago;
    }

    public Long getLiqPagoEstado() {
        return this.liqPagoEstado;
    }
    
    public void setLiqPagoEstado(Long liqPagoEstado) {
        this.liqPagoEstado = liqPagoEstado;
    }

    public String getLiqPagoOficinaCobro() {
        return this.liqPagoOficinaCobro;
    }
    
    public void setLiqPagoOficinaCobro(String liqPagoOficinaCobro) {
        this.liqPagoOficinaCobro = liqPagoOficinaCobro;
    }

    public Long getLiqPagoAgenciaCobro() {
        return this.liqPagoAgenciaCobro;
    }
    
    public void setLiqPagoAgenciaCobro(Long liqPagoAgenciaCobro) {
        this.liqPagoAgenciaCobro = liqPagoAgenciaCobro;
    }

    public String getLiqPagoObservaciones() {
        return this.liqPagoObservaciones;
    }
    
    public void setLiqPagoObservaciones(String liqPagoObservaciones) {
        this.liqPagoObservaciones = liqPagoObservaciones;
    }

    public Long getLiqPagValorProteccion() {
        return this.liqPagValorProteccion;
    }
    
    public void setLiqPagValorProteccion(Long liqPagValorProteccion) {
        this.liqPagValorProteccion = liqPagValorProteccion;
    }

    public Long getLiqPagValorCapitalizado() {
        return this.liqPagValorCapitalizado;
    }
    
    public void setLiqPagValorCapitalizado(Long liqPagValorCapitalizado) {
        this.liqPagValorCapitalizado = liqPagValorCapitalizado;
    }

    public Long getLiqPagNumCtaDep() {
        return this.liqPagNumCtaDep;
    }
    
    public void setLiqPagNumCtaDep(Long liqPagNumCtaDep) {
        this.liqPagNumCtaDep = liqPagNumCtaDep;
    }

    public String getLiqPagTipoFraccionamiento() {
        return this.liqPagTipoFraccionamiento;
    }
    
    public void setLiqPagTipoFraccionamiento(String liqPagTipoFraccionamiento) {
        this.liqPagTipoFraccionamiento = liqPagTipoFraccionamiento;
    }

    public Long getLiqPagDescVar() {
        return this.liqPagDescVar;
    }
    
    public void setLiqPagDescVar(Long liqPagDescVar) {
        this.liqPagDescVar = liqPagDescVar;
    }

    public Long getLiqPagPagarA() {
        return this.liqPagPagarA;
    }
    
    public void setLiqPagPagarA(Long liqPagPagarA) {
        this.liqPagPagarA = liqPagPagarA;
    }

    public String getLiqTipDistribucion() {
        return this.liqTipDistribucion;
    }
    
    public void setLiqTipDistribucion(String liqTipDistribucion) {
        this.liqTipDistribucion = liqTipDistribucion;
    }

    public Long getLiqPagExcDist() {
        return this.liqPagExcDist;
    }
    
    public void setLiqPagExcDist(Long liqPagExcDist) {
        this.liqPagExcDist = liqPagExcDist;
    }

    public Set getSipPlanDePagoses() {
        return this.sipPlanDePagoses;
    }
    
    public void setSipPlanDePagoses(Set sipPlanDePagoses) {
        this.sipPlanDePagoses = sipPlanDePagoses;
    }

    public Set getSipLiquidacioneses() {
        return this.sipLiquidacioneses;
    }
    
    public void setSipLiquidacioneses(Set sipLiquidacioneses) {
        this.sipLiquidacioneses = sipLiquidacioneses;
    }

	public Long getLiqPagRetefuente() {
		return liqPagRetefuente;
	}

	public void setLiqPagRetefuente(Long liqPagRetefuente) {
		this.liqPagRetefuente = liqPagRetefuente;
	}

	public String getLiqPagDescuentoSaldos() {
		return liqPagDescuentoSaldos;
	}

	public void setLiqPagDescuentoSaldos(String liqPagDescuentoSaldos) {
		this.liqPagDescuentoSaldos = liqPagDescuentoSaldos;
	}

	public Long getLiqPagTipoDeduccion() {
		return liqPagTipoDeduccion;
	}

	public void setLiqPagTipoDeduccion(Long liqPagTipoDeduccion) {
		this.liqPagTipoDeduccion = liqPagTipoDeduccion;
	}

	public Long getLiqPagValorDeduccion() {
		return liqPagValorDeduccion;
	}

	public void setLiqPagValorDeduccion(Long liqPagValorDeduccion) {
		this.liqPagValorDeduccion = liqPagValorDeduccion;
	}

	public Long getLiqPagUsuarioDescuento() {
		return liqPagUsuarioDescuento;
	}

	public void setLiqPagUsuarioDescuento(Long liqPagUsuarioDescuento) {
		this.liqPagUsuarioDescuento = liqPagUsuarioDescuento;
	}

	public String getLiqPagTipoCuenta() {
		return liqPagTipoCuenta;
	}

	public void setLiqPagTipoCuenta(String liqPagTipoCuenta) {
		this.liqPagTipoCuenta = liqPagTipoCuenta;
	}

	public Long getLiqPagCodBanco() {
		return liqPagCodBanco;
	}

	public void setLiqPagCodBanco(Long liqPagCodBanco) {
		this.liqPagCodBanco = liqPagCodBanco;
	}

	public String getLiqPagDireccionBeneficiario() {
		return liqPagDireccionBeneficiario;
	}

	public void setLiqPagDireccionBeneficiario(String liqPagDireccionBeneficiario) {
		this.liqPagDireccionBeneficiario = liqPagDireccionBeneficiario;
	}

	public String getLiqPagCorreoeBeneficiario() {
		return liqPagCorreoeBeneficiario;
	}

	public void setLiqPagCorreoeBeneficiario(String liqPagCorreoeBeneficiario) {
		this.liqPagCorreoeBeneficiario = liqPagCorreoeBeneficiario;
	}

	public String getLiqPagCodSucursal() {
		return liqPagCodSucursal;
	}

	public void setLiqPagCodSucursal(String liqPagCodSucursal) {
		this.liqPagCodSucursal = liqPagCodSucursal;
	}

	public String getLiqPagCodActividadEco() {
		return liqPagCodActividadEco;
	}

	public void setLiqPagCodActividadEco(String liqPagCodActividadEco) {
		this.liqPagCodActividadEco = liqPagCodActividadEco;
	}

	public String getLiqPagAgenciaCredito() {
		return liqPagAgenciaCredito;
	}

	public void setLiqPagAgenciaCredito(String liqPagAgenciaCredito) {
		this.liqPagAgenciaCredito = liqPagAgenciaCredito;
	}

	public String getLiqPagLineaCredito() {
		return liqPagLineaCredito;
	}

	public void setLiqPagLineaCredito(String liqPagLineaCredito) {
		this.liqPagLineaCredito = liqPagLineaCredito;
	}

	public String getLiqPagNumeroPagare() {
		return liqPagNumeroPagare;
	}

	public void setLiqPagNumeroPagare(String liqPagNumeroPagare) {
		this.liqPagNumeroPagare = liqPagNumeroPagare;
	}

	public String getLiqPagTipoAbono() {
		return liqPagTipoAbono;
	}

	public void setLiqPagTipoAbono(String liqPagTipoAbono) {
		this.liqPagTipoAbono = liqPagTipoAbono;
	}

	public void setLiqCuentaDepositoAp(String liqCuentaDepositoAp) {
		if(liqCuentaDepositoAp!=null){
			try{
			this.liqPagNumCtaDep=new Long(liqCuentaDepositoAp);
			}catch (NumberFormatException e) {
				liqPagNumCtaDep=0L;
			}
			
		}
		this.liqCuentaDepositoAp = liqCuentaDepositoAp;
	}

	public String getLiqCuentaDepositoAp() {
		return liqCuentaDepositoAp;
	}
   

}