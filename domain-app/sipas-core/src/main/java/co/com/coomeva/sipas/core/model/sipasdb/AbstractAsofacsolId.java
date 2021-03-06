package co.com.coomeva.sipas.core.model.sipasdb;



/**
 * AbstractAsofacsolId generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractAsofacsolId  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -9212101332229669077L;
	private Long fecfac;
     private Long nitcli;
     private Long catcon;
     private Long nropag;
     private Long nrotrn;


    // Constructors

    /** default constructor */
    public AbstractAsofacsolId() {
    }

    
    /** full constructor */
    public AbstractAsofacsolId(Long fecfac, Long nitcli, Long catcon, Long nropag, Long nrotrn) {
        this.fecfac = fecfac;
        this.nitcli = nitcli;
        this.catcon = catcon;
        this.nropag = nropag;
        this.nrotrn = nrotrn;
    }

   
    // Property accessors

    public Long getFecfac() {
        return this.fecfac;
    }
    
    public void setFecfac(Long fecfac) {
        this.fecfac = fecfac;
    }

    public Long getNitcli() {
        return this.nitcli;
    }
    
    public void setNitcli(Long nitcli) {
        this.nitcli = nitcli;
    }

    public Long getCatcon() {
        return this.catcon;
    }
    
    public void setCatcon(Long catcon) {
        this.catcon = catcon;
    }

    public Long getNropag() {
        return this.nropag;
    }
    
    public void setNropag(Long nropag) {
        this.nropag = nropag;
    }

    public Long getNrotrn() {
        return this.nrotrn;
    }
    
    public void setNrotrn(Long nrotrn) {
        this.nrotrn = nrotrn;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractAsofacsolId) ) return false;
		 AbstractAsofacsolId castOther = ( AbstractAsofacsolId ) other; 
         
		 return ( (this.getFecfac()==castOther.getFecfac()) || ( this.getFecfac()!=null && castOther.getFecfac()!=null && this.getFecfac().equals(castOther.getFecfac()) ) )
 && ( (this.getNitcli()==castOther.getNitcli()) || ( this.getNitcli()!=null && castOther.getNitcli()!=null && this.getNitcli().equals(castOther.getNitcli()) ) )
 && ( (this.getCatcon()==castOther.getCatcon()) || ( this.getCatcon()!=null && castOther.getCatcon()!=null && this.getCatcon().equals(castOther.getCatcon()) ) )
 && ( (this.getNropag()==castOther.getNropag()) || ( this.getNropag()!=null && castOther.getNropag()!=null && this.getNropag().equals(castOther.getNropag()) ) )
 && ( (this.getNrotrn()==castOther.getNrotrn()) || ( this.getNrotrn()!=null && castOther.getNrotrn()!=null && this.getNrotrn().equals(castOther.getNrotrn()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getFecfac() == null ? 0 : this.getFecfac().hashCode() );
         result = 37 * result + ( getNitcli() == null ? 0 : this.getNitcli().hashCode() );
         result = 37 * result + ( getCatcon() == null ? 0 : this.getCatcon().hashCode() );
         result = 37 * result + ( getNropag() == null ? 0 : this.getNropag().hashCode() );
         result = 37 * result + ( getNrotrn() == null ? 0 : this.getNrotrn().hashCode() );
         return result;
   }   





}