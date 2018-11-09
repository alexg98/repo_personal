package co.com.coomeva.sipas.core.model.sipasdb;



/**
 * AbstractSipPromocionAsegurabilidadId generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipPromocionAsegurabilidadId  implements java.io.Serializable {


    // Fields    

     private Long promConsecutivo;
     private Long aseCodigo;


    // Constructors

    /** default constructor */
    public AbstractSipPromocionAsegurabilidadId() {
    }

    
    /** full constructor */
    public AbstractSipPromocionAsegurabilidadId(Long promConsecutivo, Long aseCodigo) {
        this.promConsecutivo = promConsecutivo;
        this.aseCodigo = aseCodigo;
    }

   
    // Property accessors

    public Long getPromConsecutivo() {
        return this.promConsecutivo;
    }
    
    public void setPromConsecutivo(Long promConsecutivo) {
        this.promConsecutivo = promConsecutivo;
    }

    public Long getAseCodigo() {
        return this.aseCodigo;
    }
    
    public void setAseCodigo(Long aseCodigo) {
        this.aseCodigo = aseCodigo;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractSipPromocionAsegurabilidadId) ) return false;
		 AbstractSipPromocionAsegurabilidadId castOther = ( AbstractSipPromocionAsegurabilidadId ) other; 
         
		 return ( (this.getPromConsecutivo()==castOther.getPromConsecutivo()) || ( this.getPromConsecutivo()!=null && castOther.getPromConsecutivo()!=null && this.getPromConsecutivo().equals(castOther.getPromConsecutivo()) ) )
 && ( (this.getAseCodigo()==castOther.getAseCodigo()) || ( this.getAseCodigo()!=null && castOther.getAseCodigo()!=null && this.getAseCodigo().equals(castOther.getAseCodigo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getPromConsecutivo() == null ? 0 : this.getPromConsecutivo().hashCode() );
         result = 37 * result + ( getAseCodigo() == null ? 0 : this.getAseCodigo().hashCode() );
         return result;
   }   





}