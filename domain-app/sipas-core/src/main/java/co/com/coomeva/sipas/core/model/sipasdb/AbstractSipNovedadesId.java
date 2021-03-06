package co.com.coomeva.sipas.core.model.sipasdb;



/**
 * AbstractSipNovedadesId generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipNovedadesId  implements java.io.Serializable {


    // Fields    

     private Long tnovCodigo;
     private Long novCodigo;


    // Constructors

    /** default constructor */
    public AbstractSipNovedadesId() {
    }

    
    /** full constructor */
    public AbstractSipNovedadesId(Long tnovCodigo, Long novCodigo) {
        this.tnovCodigo = tnovCodigo;
        this.novCodigo = novCodigo;
    }

   
    // Property accessors

    public Long getTnovCodigo() {
        return this.tnovCodigo;
    }
    
    public void setTnovCodigo(Long tnovCodigo) {
        this.tnovCodigo = tnovCodigo;
    }

    public Long getNovCodigo() {
        return this.novCodigo;
    }
    
    public void setNovCodigo(Long novCodigo) {
        this.novCodigo = novCodigo;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractSipNovedadesId) ) return false;
		 AbstractSipNovedadesId castOther = ( AbstractSipNovedadesId ) other; 
         
		 return ( (this.getTnovCodigo()==castOther.getTnovCodigo()) || ( this.getTnovCodigo()!=null && castOther.getTnovCodigo()!=null && this.getTnovCodigo().equals(castOther.getTnovCodigo()) ) )
 && ( (this.getNovCodigo()==castOther.getNovCodigo()) || ( this.getNovCodigo()!=null && castOther.getNovCodigo()!=null && this.getNovCodigo().equals(castOther.getNovCodigo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTnovCodigo() == null ? 0 : this.getTnovCodigo().hashCode() );
         result = 37 * result + ( getNovCodigo() == null ? 0 : this.getNovCodigo().hashCode() );
         return result;
   }   





}