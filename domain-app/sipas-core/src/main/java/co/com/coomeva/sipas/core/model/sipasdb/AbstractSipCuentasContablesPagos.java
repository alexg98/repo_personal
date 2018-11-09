package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;


/**
 * AbstractSipCuentasContablesPagos generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipCuentasContablesPagos  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -1128137870041133113L;
	private SipCuentasContablesPagosId id;
     private SipRecaudos sipRecaudos;
     private SipCuentasContables sipCuentasContables;
     private Long periodo;
     private Long valor;
     private Date fechaPago;
     private Long valorAnterior;
     private Long estado;


    // Constructors

    /** default constructor */
    public AbstractSipCuentasContablesPagos() {
    }

	/** minimal constructor */
    public AbstractSipCuentasContablesPagos(SipCuentasContablesPagosId id, SipCuentasContables sipCuentasContables, Long periodo, Long valor, Date fechaPago) {
        this.id = id;
        this.sipCuentasContables = sipCuentasContables;
        this.periodo = periodo;
        this.valor = valor;
        this.fechaPago = fechaPago;
    }
    
    /** full constructor */
    public AbstractSipCuentasContablesPagos(SipCuentasContablesPagosId id, SipRecaudos sipRecaudos, SipCuentasContables sipCuentasContables, Long periodo, Long valor, Date fechaPago, Long valorAnterior, Long estado) {
        this.id = id;
        this.sipRecaudos = sipRecaudos;
        this.sipCuentasContables = sipCuentasContables;
        this.periodo = periodo;
        this.valor = valor;
        this.fechaPago = fechaPago;
        this.valorAnterior = valorAnterior;
        this.estado = estado;
    }

   
    // Property accessors

    public SipCuentasContablesPagosId getId() {
        return this.id;
    }
    
    public void setId(SipCuentasContablesPagosId id) {
        this.id = id;
    }

    public SipRecaudos getSipRecaudos() {
        return this.sipRecaudos;
    }
    
    public void setSipRecaudos(SipRecaudos sipRecaudos) {
        this.sipRecaudos = sipRecaudos;
    }

    public SipCuentasContables getSipCuentasContables() {
        return this.sipCuentasContables;
    }
    
    public void setSipCuentasContables(SipCuentasContables sipCuentasContables) {
        this.sipCuentasContables = sipCuentasContables;
    }

    public Long getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(Long periodo) {
        this.periodo = periodo;
    }

    public Long getValor() {
        return this.valor;
    }
    
    public void setValor(Long valor) {
        this.valor = valor;
    }

    public Date getFechaPago() {
        return this.fechaPago;
    }
    
    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Long getValorAnterior() {
        return this.valorAnterior;
    }
    
    public void setValorAnterior(Long valorAnterior) {
        this.valorAnterior = valorAnterior;
    }

    public Long getEstado() {
        return this.estado;
    }
    
    public void setEstado(Long estado) {
        this.estado = estado;
    }
   








}