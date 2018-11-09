package co.com.coomeva.sipas.core.model.sipasdb;



/**
 * AbstractSipFacturaId generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipFacturaId  implements java.io.Serializable {


    // Fields    

     private Long asoNumint;
     private Long periodo;


    // Constructors

    /** default constructor */
    public AbstractSipFacturaId() {
    }

    
    /** full constructor */
    public AbstractSipFacturaId(Long asoNumint, Long periodo) {
        this.asoNumint = asoNumint;
        this.periodo = periodo;
    }

   
    // Property accessors

    public Long getAsoNumint() {
        return this.asoNumint;
    }
    
    public void setAsoNumint(Long asoNumint) {
        this.asoNumint = asoNumint;
    }

    public Long getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(Long periodo) {
        this.periodo = periodo;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractSipFacturaId) ) return false;
		 AbstractSipFacturaId castOther = ( AbstractSipFacturaId ) other; 
         
		 return ( (this.getAsoNumint()==castOther.getAsoNumint()) || ( this.getAsoNumint()!=null && castOther.getAsoNumint()!=null && this.getAsoNumint().equals(castOther.getAsoNumint()) ) )
 && ( (this.getPeriodo()==castOther.getPeriodo()) || ( this.getPeriodo()!=null && castOther.getPeriodo()!=null && this.getPeriodo().equals(castOther.getPeriodo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getAsoNumint() == null ? 0 : this.getAsoNumint().hashCode() );
         result = 37 * result + ( getPeriodo() == null ? 0 : this.getPeriodo().hashCode() );
         return result;
   }   





}