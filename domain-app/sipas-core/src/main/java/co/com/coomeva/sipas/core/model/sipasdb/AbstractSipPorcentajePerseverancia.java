package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;


/**
 * AbstractSipPorcentajesDevolucion generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipPorcentajePerseverancia  implements java.io.Serializable {


    // Fields    

     private Long porConsecutivo;
     private Long porValorMin;
     private Long porValorMax;
     private Double porPorcentajeDev;
     private Long porEstado;
     private Date porFechaReg;
     private SipPorcentajeTipo sipPorcentajeTipo;


    // Constructors

    /** default constructor */
    public AbstractSipPorcentajePerseverancia() {
    }

	/** minimal constructor */
    public AbstractSipPorcentajePerseverancia(Long porConsecutivo, Double porPorcentajeDev, Long porEstado) {
        this.porConsecutivo = porConsecutivo;
        this.porPorcentajeDev = porPorcentajeDev;
        this.porEstado = porEstado;
    }
    
    /** full constructor */
    public AbstractSipPorcentajePerseverancia(Long porConsecutivo, Long porValorMin, Long porValorMax, Double porPorcentajeDev, Long porEstado, Date porFechaReg, SipPorcentajeTipo sipPorcentajeTipo) {
        this.porConsecutivo = porConsecutivo;
        this.porValorMin = porValorMin;
        this.porValorMax = porValorMax;
        this.porPorcentajeDev = porPorcentajeDev;
        this.porEstado = porEstado;
        this.porFechaReg = porFechaReg;
        this.sipPorcentajeTipo = sipPorcentajeTipo;
    }

   
    // Property accessors

    public Long getPorConsecutivo() {
        return this.porConsecutivo;
    }
    
    public void setPorConsecutivo(Long porConsecutivo) {
        this.porConsecutivo = porConsecutivo;
    }

    public Long getPorValorMin() {
        return this.porValorMin;
    }
    
    public void setPorValorMin(Long porValorMin) {
        this.porValorMin = porValorMin;
    }

    public Long getPorValorMax() {
        return this.porValorMax;
    }
    
    public void setPorValorMax(Long porValorMax) {
        this.porValorMax = porValorMax;
    }

    public Double getPorPorcentajeDev() {
        return this.porPorcentajeDev;
    }
    
    public void setPorPorcentajeDev(Double porPorcentajeDev) {
        this.porPorcentajeDev = porPorcentajeDev;
    }

    public Long getPorEstado() {
        return this.porEstado;
    }
    
    public void setPorEstado(Long porEstado) {
        this.porEstado = porEstado;
    }

    public Date getPorFechaReg() {
        return this.porFechaReg;
    }
    
    public void setPorFechaReg(Date porFechaReg) {
        this.porFechaReg = porFechaReg;
    }

	public SipPorcentajeTipo getSipPorcentajeTipo() {
		return sipPorcentajeTipo;
	}

	public void setSipPorcentajeTipo(SipPorcentajeTipo sipPorcentajeTipo) {
		this.sipPorcentajeTipo = sipPorcentajeTipo;
	}

}