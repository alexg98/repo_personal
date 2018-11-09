package co.com.coomeva.sipas.core.model.sipasdb;



/**
 * AbstractSipPlanDePagosId generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipPlanDePagosId  implements java.io.Serializable {


    // Fields    

     private Long planPagConsecutivo;
     private Long liqPagConsecutivo;
     private Long pagDifConsecutivo;


    // Constructors

    /** default constructor */
    public AbstractSipPlanDePagosId() {
    }

    
    /** full constructor */
    public AbstractSipPlanDePagosId(Long planPagConsecutivo, Long liqPagConsecutivo, Long pagDifConsecutivo) {
        this.planPagConsecutivo = planPagConsecutivo;
        this.liqPagConsecutivo = liqPagConsecutivo;
        this.pagDifConsecutivo = pagDifConsecutivo;
    }

   
    // Property accessors

    public Long getPlanPagConsecutivo() {
        return this.planPagConsecutivo;
    }
    
    public void setPlanPagConsecutivo(Long planPagConsecutivo) {
        this.planPagConsecutivo = planPagConsecutivo;
    }

    public Long getLiqPagConsecutivo() {
        return this.liqPagConsecutivo;
    }
    
    public void setLiqPagConsecutivo(Long liqPagConsecutivo) {
        this.liqPagConsecutivo = liqPagConsecutivo;
    }

    public Long getPagDifConsecutivo() {
        return this.pagDifConsecutivo;
    }
    
    public void setPagDifConsecutivo(Long pagDifConsecutivo) {
        this.pagDifConsecutivo = pagDifConsecutivo;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractSipPlanDePagosId) ) return false;
		 AbstractSipPlanDePagosId castOther = ( AbstractSipPlanDePagosId ) other; 
         
		 return ( (this.getPlanPagConsecutivo()==castOther.getPlanPagConsecutivo()) || ( this.getPlanPagConsecutivo()!=null && castOther.getPlanPagConsecutivo()!=null && this.getPlanPagConsecutivo().equals(castOther.getPlanPagConsecutivo()) ) )
 && ( (this.getLiqPagConsecutivo()==castOther.getLiqPagConsecutivo()) || ( this.getLiqPagConsecutivo()!=null && castOther.getLiqPagConsecutivo()!=null && this.getLiqPagConsecutivo().equals(castOther.getLiqPagConsecutivo()) ) )
 && ( (this.getPagDifConsecutivo()==castOther.getPagDifConsecutivo()) || ( this.getPagDifConsecutivo()!=null && castOther.getPagDifConsecutivo()!=null && this.getPagDifConsecutivo().equals(castOther.getPagDifConsecutivo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getPlanPagConsecutivo() == null ? 0 : this.getPlanPagConsecutivo().hashCode() );
         result = 37 * result + ( getLiqPagConsecutivo() == null ? 0 : this.getLiqPagConsecutivo().hashCode() );
         result = 37 * result + ( getPagDifConsecutivo() == null ? 0 : this.getPagDifConsecutivo().hashCode() );
         return result;
   }   





}