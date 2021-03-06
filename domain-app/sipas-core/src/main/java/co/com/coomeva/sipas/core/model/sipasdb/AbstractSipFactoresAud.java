package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;


/**
 * AbstractSipFactoresAud generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipFactoresAud  implements java.io.Serializable {


    // Fields    

     private Long consecutivo;
     private Long factorCodigo;
     private Long codigo;
     private Long tipCod;
     private Long vinCod;
     private Long perCodigo;
     private Long edad;
     private Double valor;
     private String usuario;
     private Date fechaRegistro;
     private String incremento;
     private Long ano;


    // Constructors

    /** default constructor */
    public AbstractSipFactoresAud() {
    }

	/** minimal constructor */
    public AbstractSipFactoresAud(Long consecutivo, Long factorCodigo, Long perCodigo, Double valor, String usuario, Date fechaRegistro) {
        this.consecutivo = consecutivo;
        this.factorCodigo = factorCodigo;
        this.perCodigo = perCodigo;
        this.valor = valor;
        this.usuario = usuario;
        this.fechaRegistro = fechaRegistro;
    }
    
    /** full constructor */
    public AbstractSipFactoresAud(Long consecutivo, Long factorCodigo, Long codigo, Long tipCod, Long vinCod, Long perCodigo, Long edad, Double valor, String usuario, Date fechaRegistro, String incremento, Long ano) {
        this.consecutivo = consecutivo;
        this.factorCodigo = factorCodigo;
        this.codigo = codigo;
        this.tipCod = tipCod;
        this.vinCod = vinCod;
        this.perCodigo = perCodigo;
        this.edad = edad;
        this.valor = valor;
        this.usuario = usuario;
        this.fechaRegistro = fechaRegistro;
        this.incremento = incremento;
        this.ano = ano;
    }

   
    // Property accessors

    public Long getConsecutivo() {
        return this.consecutivo;
    }
    
    public void setConsecutivo(Long consecutivo) {
        this.consecutivo = consecutivo;
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

    public Long getTipCod() {
        return this.tipCod;
    }
    
    public void setTipCod(Long tipCod) {
        this.tipCod = tipCod;
    }

    public Long getVinCod() {
        return this.vinCod;
    }
    
    public void setVinCod(Long vinCod) {
        this.vinCod = vinCod;
    }

    public Long getPerCodigo() {
        return this.perCodigo;
    }
    
    public void setPerCodigo(Long perCodigo) {
        this.perCodigo = perCodigo;
    }

    public Long getEdad() {
        return this.edad;
    }
    
    public void setEdad(Long edad) {
        this.edad = edad;
    }

    public Double getValor() {
        return this.valor;
    }
    
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getIncremento() {
        return this.incremento;
    }
    
    public void setIncremento(String incremento) {
        this.incremento = incremento;
    }

    public Long getAno() {
        return this.ano;
    }
    
    public void setAno(Long ano) {
        this.ano = ano;
    }
   








}