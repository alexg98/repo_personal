package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractSipNivelesRiesgo generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipNivelesRiesgo  implements java.io.Serializable {


    // Fields    

     private Long nivelCod;
     private String nivDesc;
     private Set sipPreexistenciases = new HashSet(0);
     private Set sipNivelesCondicioneses = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractSipNivelesRiesgo() {
    }

	/** minimal constructor */
    public AbstractSipNivelesRiesgo(Long nivelCod) {
        this.nivelCod = nivelCod;
    }
    
    /** full constructor */
    public AbstractSipNivelesRiesgo(Long nivelCod, String nivDesc, Set sipPreexistenciases, Set sipNivelesCondicioneses) {
        this.nivelCod = nivelCod;
        this.nivDesc = nivDesc;
        this.sipPreexistenciases = sipPreexistenciases;
        this.sipNivelesCondicioneses = sipNivelesCondicioneses;
    }

   
    // Property accessors

    public Long getNivelCod() {
        return this.nivelCod;
    }
    
    public void setNivelCod(Long nivelCod) {
        this.nivelCod = nivelCod;
    }

    public String getNivDesc() {
        return this.nivDesc;
    }
    
    public void setNivDesc(String nivDesc) {
        this.nivDesc = nivDesc;
    }

    public Set getSipPreexistenciases() {
        return this.sipPreexistenciases;
    }
    
    public void setSipPreexistenciases(Set sipPreexistenciases) {
        this.sipPreexistenciases = sipPreexistenciases;
    }

    public Set getSipNivelesCondicioneses() {
        return this.sipNivelesCondicioneses;
    }
    
    public void setSipNivelesCondicioneses(Set sipNivelesCondicioneses) {
        this.sipNivelesCondicioneses = sipNivelesCondicioneses;
    }
   








}