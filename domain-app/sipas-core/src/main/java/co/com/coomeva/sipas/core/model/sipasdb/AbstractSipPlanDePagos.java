package co.com.coomeva.sipas.core.model.sipasdb;



/**
 * AbstractSipPlanDePagos generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipPlanDePagos  implements java.io.Serializable {


    // Fields    

     private SipPlanDePagosId id;
     private SipPagosDiferidos sipPagosDiferidos;
     private SipLiquidaciones sipLiquidaciones;
     private Long planPagMes;
     private Long planPagExcValPers;
     private Long planPagCuotaMes;
     private Double planPagIntereses;
     private Long planPagExcValCapm;
     private Long planPagAcumValMes;
     private Double planPagBaseRetfte;
     private Long planPagNetoPagoMes;
     private Long planPagEstado;
     private String planPagPagoCuotaMes;
     private Long planPagValorCuotaMes;
     private Long planPagFormaPago;
     private Long planPagAgenciaCobro;
     private Long planPagDescuentosCart;
     private String planPagPagoNumCta;
     private String planPagDescVar;
     private String planPagPeriodoPag;
     private Long planPagAnalistaPag;
     private String planPagExcedente;
     private Double planPagRetfte;
     private Double planPagTasaFlex;


    // Constructors

    /** default constructor */
    public AbstractSipPlanDePagos() {
    }

	/** minimal constructor */
    public AbstractSipPlanDePagos(SipPlanDePagosId id, SipPagosDiferidos sipPagosDiferidos, SipLiquidaciones sipLiquidaciones, Long planPagMes, Long planPagExcValPers, Long planPagCuotaMes, Double planPagIntereses, Long planPagExcValCapm, Long planPagAcumValMes, Double planPagBaseRetfte, Long planPagNetoPagoMes, Long planPagEstado) {
        this.id = id;
        this.sipPagosDiferidos = sipPagosDiferidos;
        this.sipLiquidaciones = sipLiquidaciones;
        this.planPagMes = planPagMes;
        this.planPagExcValPers = planPagExcValPers;
        this.planPagCuotaMes = planPagCuotaMes;
        this.planPagIntereses = planPagIntereses;
        this.planPagExcValCapm = planPagExcValCapm;
        this.planPagAcumValMes = planPagAcumValMes;
        this.planPagBaseRetfte = planPagBaseRetfte;
        this.planPagNetoPagoMes = planPagNetoPagoMes;
        this.planPagEstado = planPagEstado;
    }
    
    /** full constructor */
    public AbstractSipPlanDePagos(SipPlanDePagosId id, SipPagosDiferidos sipPagosDiferidos, SipLiquidaciones sipLiquidaciones, Long planPagMes, Long planPagExcValPers, Long planPagCuotaMes, Double planPagIntereses, Long planPagExcValCapm, Long planPagAcumValMes, Double planPagBaseRetfte, Long planPagNetoPagoMes, Long planPagEstado, String planPagPagoCuotaMes, Long planPagValorCuotaMes, Long planPagFormaPago, Long planPagAgenciaCobro, Long planPagDescuentosCart, String planPagPagoNumCta, String planPagDescVar, String planPagPeriodoPag, Long planPagAnalistaPag, String planPagExcedente, Double planPagRetfte, Double planPagTasaFlex) {
        this.id = id;
        this.sipPagosDiferidos = sipPagosDiferidos;
        this.sipLiquidaciones = sipLiquidaciones;
        this.planPagMes = planPagMes;
        this.planPagExcValPers = planPagExcValPers;
        this.planPagCuotaMes = planPagCuotaMes;
        this.planPagIntereses = planPagIntereses;
        this.planPagExcValCapm = planPagExcValCapm;
        this.planPagAcumValMes = planPagAcumValMes;
        this.planPagBaseRetfte = planPagBaseRetfte;
        this.planPagNetoPagoMes = planPagNetoPagoMes;
        this.planPagEstado = planPagEstado;
        this.planPagPagoCuotaMes = planPagPagoCuotaMes;
        this.planPagValorCuotaMes = planPagValorCuotaMes;
        this.planPagFormaPago = planPagFormaPago;
        this.planPagAgenciaCobro = planPagAgenciaCobro;
        this.planPagDescuentosCart = planPagDescuentosCart;
        this.planPagPagoNumCta = planPagPagoNumCta;
        this.planPagDescVar = planPagDescVar;
        this.planPagPeriodoPag = planPagPeriodoPag;
        this.planPagAnalistaPag = planPagAnalistaPag;
        this.planPagExcedente = planPagExcedente;
        this.planPagRetfte = planPagRetfte;
        this.planPagTasaFlex = planPagTasaFlex;
    }

   
    // Property accessors

    public SipPlanDePagosId getId() {
        return this.id;
    }
    
    public void setId(SipPlanDePagosId id) {
        this.id = id;
    }

    public SipPagosDiferidos getSipPagosDiferidos() {
        return this.sipPagosDiferidos;
    }
    
    public void setSipPagosDiferidos(SipPagosDiferidos sipPagosDiferidos) {
        this.sipPagosDiferidos = sipPagosDiferidos;
    }

    public SipLiquidaciones getSipLiquidaciones() {
        return this.sipLiquidaciones;
    }
    
    public void setSipLiquidaciones(SipLiquidaciones sipLiquidaciones) {
        this.sipLiquidaciones = sipLiquidaciones;
    }

    public Long getPlanPagMes() {
        return this.planPagMes;
    }
    
    public void setPlanPagMes(Long planPagMes) {
        this.planPagMes = planPagMes;
    }

    public Long getPlanPagExcValPers() {
        return this.planPagExcValPers;
    }
    
    public void setPlanPagExcValPers(Long planPagExcValPers) {
        this.planPagExcValPers = planPagExcValPers;
    }

    public Long getPlanPagCuotaMes() {
        return this.planPagCuotaMes;
    }
    
    public void setPlanPagCuotaMes(Long planPagCuotaMes) {
        this.planPagCuotaMes = planPagCuotaMes;
    }

    public Double getPlanPagIntereses() {
        return this.planPagIntereses;
    }
    
    public void setPlanPagIntereses(Double planPagIntereses) {
        this.planPagIntereses = planPagIntereses;
    }

    public Long getPlanPagExcValCapm() {
        return this.planPagExcValCapm;
    }
    
    public void setPlanPagExcValCapm(Long planPagExcValCapm) {
        this.planPagExcValCapm = planPagExcValCapm;
    }

    public Long getPlanPagAcumValMes() {
        return this.planPagAcumValMes;
    }
    
    public void setPlanPagAcumValMes(Long planPagAcumValMes) {
        this.planPagAcumValMes = planPagAcumValMes;
    }

    public Double getPlanPagBaseRetfte() {
        return this.planPagBaseRetfte;
    }
    
    public void setPlanPagBaseRetfte(Double planPagBaseRetfte) {
        this.planPagBaseRetfte = planPagBaseRetfte;
    }

    public Long getPlanPagNetoPagoMes() {
        return this.planPagNetoPagoMes;
    }
    
    public void setPlanPagNetoPagoMes(Long planPagNetoPagoMes) {
        this.planPagNetoPagoMes = planPagNetoPagoMes;
    }

    public Long getPlanPagEstado() {
        return this.planPagEstado;
    }
    
    public void setPlanPagEstado(Long planPagEstado) {
        this.planPagEstado = planPagEstado;
    }

    public String getPlanPagPagoCuotaMes() {
        return this.planPagPagoCuotaMes;
    }
    
    public void setPlanPagPagoCuotaMes(String planPagPagoCuotaMes) {
        this.planPagPagoCuotaMes = planPagPagoCuotaMes;
    }

    public Long getPlanPagValorCuotaMes() {
        return this.planPagValorCuotaMes;
    }
    
    public void setPlanPagValorCuotaMes(Long planPagValorCuotaMes) {
        this.planPagValorCuotaMes = planPagValorCuotaMes;
    }

    public Long getPlanPagFormaPago() {
        return this.planPagFormaPago;
    }
    
    public void setPlanPagFormaPago(Long planPagFormaPago) {
        this.planPagFormaPago = planPagFormaPago;
    }

    public Long getPlanPagAgenciaCobro() {
        return this.planPagAgenciaCobro;
    }
    
    public void setPlanPagAgenciaCobro(Long planPagAgenciaCobro) {
        this.planPagAgenciaCobro = planPagAgenciaCobro;
    }

    public Long getPlanPagDescuentosCart() {
        return this.planPagDescuentosCart;
    }
    
    public void setPlanPagDescuentosCart(Long planPagDescuentosCart) {
        this.planPagDescuentosCart = planPagDescuentosCart;
    }

    public String getPlanPagPagoNumCta() {
        return this.planPagPagoNumCta;
    }
    
    public void setPlanPagPagoNumCta(String planPagPagoNumCta) {
        this.planPagPagoNumCta = planPagPagoNumCta;
    }

    public String getPlanPagDescVar() {
        return this.planPagDescVar;
    }
    
    public void setPlanPagDescVar(String planPagDescVar) {
        this.planPagDescVar = planPagDescVar;
    }

    public String getPlanPagPeriodoPag() {
        return this.planPagPeriodoPag;
    }
    
    public void setPlanPagPeriodoPag(String planPagPeriodoPag) {
        this.planPagPeriodoPag = planPagPeriodoPag;
    }

    public Long getPlanPagAnalistaPag() {
        return this.planPagAnalistaPag;
    }
    
    public void setPlanPagAnalistaPag(Long planPagAnalistaPag) {
        this.planPagAnalistaPag = planPagAnalistaPag;
    }

    public String getPlanPagExcedente() {
        return this.planPagExcedente;
    }
    
    public void setPlanPagExcedente(String planPagExcedente) {
        this.planPagExcedente = planPagExcedente;
    }

    public Double getPlanPagRetfte() {
        return this.planPagRetfte;
    }
    
    public void setPlanPagRetfte(Double planPagRetfte) {
        this.planPagRetfte = planPagRetfte;
    }

    public Double getPlanPagTasaFlex() {
        return this.planPagTasaFlex;
    }
    
    public void setPlanPagTasaFlex(Double planPagTasaFlex) {
        this.planPagTasaFlex = planPagTasaFlex;
    }
   








}