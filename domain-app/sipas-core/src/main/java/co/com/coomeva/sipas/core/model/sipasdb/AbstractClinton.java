package co.com.coomeva.sipas.core.model.sipasdb;



/**
 * AbstractClinton generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractClinton  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -2500416062086315402L;
	private ClintonId id;


    // Constructors

    /** default constructor */
    public AbstractClinton() {
    }

    
    /** full constructor */
    public AbstractClinton(ClintonId id) {
        this.id = id;
    }

   
    // Property accessors

    public ClintonId getId() {
        return this.id;
    }
    
    public void setId(ClintonId id) {
        this.id = id;
    }
   








}