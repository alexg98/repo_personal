package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;


/**
 * AbstractSipSmmlv generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipSmmlv  implements java.io.Serializable {


    // Fields    

     private Long codigo;
     private Double smmlv;
     private String descripcion;
     private Date fechaIni;
     private Date fechaFin;


    // Constructors

    /** default constructor */
    public AbstractSipSmmlv() {
    }

	/** minimal constructor */
    public AbstractSipSmmlv(Long codigo, Double smmlv, Date fechaFin) {
        this.codigo = codigo;
        this.smmlv = smmlv;
        this.fechaFin = fechaFin;
    }
    
    /** full constructor */
    public AbstractSipSmmlv(Long codigo, Double smmlv, String descripcion, Date fechaIni, Date fechaFin) {
        this.codigo = codigo;
        this.smmlv = smmlv;
        this.descripcion = descripcion;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

   
    // Property accessors

    public Long getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Double getSmmlv() {
        return this.smmlv;
    }
    
    public void setSmmlv(Double smmlv) {
        this.smmlv = smmlv;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaIni() {
        return this.fechaIni;
    }
    
    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
   








}