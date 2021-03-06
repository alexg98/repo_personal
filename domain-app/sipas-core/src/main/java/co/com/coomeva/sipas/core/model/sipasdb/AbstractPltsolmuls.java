package co.com.coomeva.sipas.core.model.sipasdb;



/**
 * AbstractPltsolmuls generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractPltsolmuls  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -7052767354465440828L;
	private PltsolmulsId id;
     private Long codsis;
     private Long codpro;
     private Long codtrn;
     private Long hortrn;
     private Long agcdst;
     private Long medpag;
     private String nroprd;
     private String infdep;
     private Long nroref;
     private Long ctanro;
     private Double vlrtrn;
     private Long fecefe;
     private Long fecpro;
     private Long tipmov;
     private Long esttrn;
     private String usring;
     private Long agcopr;
     private String nroopr;
     private Long indcnj;
     private String infprd;
     private Long nrobnv;
     private Long nronit;
     private Long ind101;
     private Long indpat;
     private Long codope;
     private Long codems;
     private Long codban;
     private Long consec;
     private Long dis001;
     private String dis002;
     private Long cauanu;


    // Constructors

    /** default constructor */
    public AbstractPltsolmuls() {
    }

    
    /** full constructor */
    public AbstractPltsolmuls(PltsolmulsId id, Long codsis, Long codpro, Long codtrn, Long hortrn, Long agcdst, Long medpag, String nroprd, String infdep, Long nroref, Long ctanro, Double vlrtrn, Long fecefe, Long fecpro, Long tipmov, Long esttrn, String usring, Long agcopr, String nroopr, Long indcnj, String infprd, Long nrobnv, Long nronit, Long ind101, Long indpat, Long codope, Long codems, Long codban, Long consec, Long dis001, String dis002, Long cauanu) {
        this.id = id;
        this.codsis = codsis;
        this.codpro = codpro;
        this.codtrn = codtrn;
        this.hortrn = hortrn;
        this.agcdst = agcdst;
        this.medpag = medpag;
        this.nroprd = nroprd;
        this.infdep = infdep;
        this.nroref = nroref;
        this.ctanro = ctanro;
        this.vlrtrn = vlrtrn;
        this.fecefe = fecefe;
        this.fecpro = fecpro;
        this.tipmov = tipmov;
        this.esttrn = esttrn;
        this.usring = usring;
        this.agcopr = agcopr;
        this.nroopr = nroopr;
        this.indcnj = indcnj;
        this.infprd = infprd;
        this.nrobnv = nrobnv;
        this.nronit = nronit;
        this.ind101 = ind101;
        this.indpat = indpat;
        this.codope = codope;
        this.codems = codems;
        this.codban = codban;
        this.consec = consec;
        this.dis001 = dis001;
        this.dis002 = dis002;
        this.cauanu = cauanu;
    }

   
    // Property accessors

    public PltsolmulsId getId() {
        return this.id;
    }
    
    public void setId(PltsolmulsId id) {
        this.id = id;
    }

    public Long getCodsis() {
        return this.codsis;
    }
    
    public void setCodsis(Long codsis) {
        this.codsis = codsis;
    }

    public Long getCodpro() {
        return this.codpro;
    }
    
    public void setCodpro(Long codpro) {
        this.codpro = codpro;
    }

    public Long getCodtrn() {
        return this.codtrn;
    }
    
    public void setCodtrn(Long codtrn) {
        this.codtrn = codtrn;
    }

    public Long getHortrn() {
        return this.hortrn;
    }
    
    public void setHortrn(Long hortrn) {
        this.hortrn = hortrn;
    }

    public Long getAgcdst() {
        return this.agcdst;
    }
    
    public void setAgcdst(Long agcdst) {
        this.agcdst = agcdst;
    }

    public Long getMedpag() {
        return this.medpag;
    }
    
    public void setMedpag(Long medpag) {
        this.medpag = medpag;
    }

    public String getNroprd() {
        return this.nroprd;
    }
    
    public void setNroprd(String nroprd) {
        this.nroprd = nroprd;
    }

    public String getInfdep() {
        return this.infdep;
    }
    
    public void setInfdep(String infdep) {
        this.infdep = infdep;
    }

    public Long getNroref() {
        return this.nroref;
    }
    
    public void setNroref(Long nroref) {
        this.nroref = nroref;
    }

    public Long getCtanro() {
        return this.ctanro;
    }
    
    public void setCtanro(Long ctanro) {
        this.ctanro = ctanro;
    }

    public Double getVlrtrn() {
        return this.vlrtrn;
    }
    
    public void setVlrtrn(Double vlrtrn) {
        this.vlrtrn = vlrtrn;
    }

    public Long getFecefe() {
        return this.fecefe;
    }
    
    public void setFecefe(Long fecefe) {
        this.fecefe = fecefe;
    }

    public Long getFecpro() {
        return this.fecpro;
    }
    
    public void setFecpro(Long fecpro) {
        this.fecpro = fecpro;
    }

    public Long getTipmov() {
        return this.tipmov;
    }
    
    public void setTipmov(Long tipmov) {
        this.tipmov = tipmov;
    }

    public Long getEsttrn() {
        return this.esttrn;
    }
    
    public void setEsttrn(Long esttrn) {
        this.esttrn = esttrn;
    }

    public String getUsring() {
        return this.usring;
    }
    
    public void setUsring(String usring) {
        this.usring = usring;
    }

    public Long getAgcopr() {
        return this.agcopr;
    }
    
    public void setAgcopr(Long agcopr) {
        this.agcopr = agcopr;
    }

    public String getNroopr() {
        return this.nroopr;
    }
    
    public void setNroopr(String nroopr) {
        this.nroopr = nroopr;
    }

    public Long getIndcnj() {
        return this.indcnj;
    }
    
    public void setIndcnj(Long indcnj) {
        this.indcnj = indcnj;
    }

    public String getInfprd() {
        return this.infprd;
    }
    
    public void setInfprd(String infprd) {
        this.infprd = infprd;
    }

    public Long getNrobnv() {
        return this.nrobnv;
    }
    
    public void setNrobnv(Long nrobnv) {
        this.nrobnv = nrobnv;
    }

    public Long getNronit() {
        return this.nronit;
    }
    
    public void setNronit(Long nronit) {
        this.nronit = nronit;
    }

    public Long getInd101() {
        return this.ind101;
    }
    
    public void setInd101(Long ind101) {
        this.ind101 = ind101;
    }

    public Long getIndpat() {
        return this.indpat;
    }
    
    public void setIndpat(Long indpat) {
        this.indpat = indpat;
    }

    public Long getCodope() {
        return this.codope;
    }
    
    public void setCodope(Long codope) {
        this.codope = codope;
    }

    public Long getCodems() {
        return this.codems;
    }
    
    public void setCodems(Long codems) {
        this.codems = codems;
    }

    public Long getCodban() {
        return this.codban;
    }
    
    public void setCodban(Long codban) {
        this.codban = codban;
    }

    public Long getConsec() {
        return this.consec;
    }
    
    public void setConsec(Long consec) {
        this.consec = consec;
    }

    public Long getDis001() {
        return this.dis001;
    }
    
    public void setDis001(Long dis001) {
        this.dis001 = dis001;
    }

    public String getDis002() {
        return this.dis002;
    }
    
    public void setDis002(String dis002) {
        this.dis002 = dis002;
    }

    public Long getCauanu() {
        return this.cauanu;
    }
    
    public void setCauanu(Long cauanu) {
        this.cauanu = cauanu;
    }
   








}