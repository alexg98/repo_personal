package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;


/**
 * AbstractSipFacturaDetalle generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractVSipFacturaDetalle  implements java.io.Serializable {


    // Fields    

     private Long consFacDet;
     private SipFactura sipFactura;
     private SipFacConceptoProducto sipFacConceptoProducto;
     private Long valorCuota;
     private Long valorGenerado;
     private Long valorFacturado;
     private Long valorMora;
     private Long pagoMora;
     private Long valorPagado;
     private String estado;
     private Long saldoValorFacturado;
     private Long saldoMora;
     private Date fechaPago;
     private String observacion;


    // Constructors

    /** default constructor */
    public AbstractVSipFacturaDetalle() {
    }

	/** minimal constructor */
    public AbstractVSipFacturaDetalle(Long consFacDet, SipFactura sipFactura, SipFacConceptoProducto sipFacConceptoProducto, Long valorCuota, Long valorGenerado, Long valorFacturado, String estado) {
        this.consFacDet = consFacDet;
        this.sipFactura = sipFactura;
        this.sipFacConceptoProducto = sipFacConceptoProducto;
        this.valorCuota = valorCuota;
        this.valorGenerado = valorGenerado;
        this.valorFacturado = valorFacturado;
        this.estado = estado;
    }
    
    /** full constructor */
    public AbstractVSipFacturaDetalle(Long consFacDet, SipFactura sipFactura, SipFacConceptoProducto sipFacConceptoProducto, Long valorCuota, Long valorGenerado, Long valorFacturado, Long valorMora, Long pagoMora, Long valorPagado, String estado, Long saldoValorFacturado, Long saldoMora, Date fechaPago, String observacion) {
        this.consFacDet = consFacDet;
        this.sipFactura = sipFactura;
        this.sipFacConceptoProducto = sipFacConceptoProducto;
        this.valorCuota = valorCuota;
        this.valorGenerado = valorGenerado;
        this.valorFacturado = valorFacturado;
        this.valorMora = valorMora;
        this.pagoMora = pagoMora;
        this.valorPagado = valorPagado;
        this.estado = estado;
        this.saldoValorFacturado = saldoValorFacturado;
        this.saldoMora = saldoMora;
        this.fechaPago = fechaPago;
        this.observacion = observacion;
    }

   
    // Property accessors

    public Long getConsFacDet() {
        return this.consFacDet;
    }
    
    public void setConsFacDet(Long consFacDet) {
        this.consFacDet = consFacDet;
    }

    public SipFactura getSipFactura() {
        return this.sipFactura;
    }
    
    public void setSipFactura(SipFactura sipFactura) {
        this.sipFactura = sipFactura;
    }

    public SipFacConceptoProducto getSipFacConceptoProducto() {
        return this.sipFacConceptoProducto;
    }
    
    public void setSipFacConceptoProducto(SipFacConceptoProducto sipFacConceptoProducto) {
        this.sipFacConceptoProducto = sipFacConceptoProducto;
    }

    public Long getValorCuota() {
        return this.valorCuota;
    }
    
    public void setValorCuota(Long valorCuota) {
        this.valorCuota = valorCuota;
    }

    public Long getValorGenerado() {
        return this.valorGenerado;
    }
    
    public void setValorGenerado(Long valorGenerado) {
        this.valorGenerado = valorGenerado;
    }

    public Long getValorFacturado() {
        return this.valorFacturado;
    }
    
    public void setValorFacturado(Long valorFacturado) {
        this.valorFacturado = valorFacturado;
    }

    public Long getValorMora() {
        return this.valorMora;
    }
    
    public void setValorMora(Long valorMora) {
        this.valorMora = valorMora;
    }

    public Long getPagoMora() {
        return this.pagoMora;
    }
    
    public void setPagoMora(Long pagoMora) {
        this.pagoMora = pagoMora;
    }

    public Long getValorPagado() {
        return this.valorPagado;
    }
    
    public void setValorPagado(Long valorPagado) {
        this.valorPagado = valorPagado;
    }

    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getSaldoValorFacturado() {
        return this.saldoValorFacturado;
    }
    
    public void setSaldoValorFacturado(Long saldoValorFacturado) {
        this.saldoValorFacturado = saldoValorFacturado;
    }

    public Long getSaldoMora() {
        return this.saldoMora;
    }
    
    public void setSaldoMora(Long saldoMora) {
        this.saldoMora = saldoMora;
    }

    public Date getFechaPago() {
        return this.fechaPago;
    }
    
    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
   








}