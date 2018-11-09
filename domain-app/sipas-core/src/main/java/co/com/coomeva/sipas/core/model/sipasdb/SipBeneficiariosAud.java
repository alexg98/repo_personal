package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Date;


/**
 * SipBeneficiariosAud generated by MyEclipse - Hibernate Tools
 */
public class SipBeneficiariosAud extends AbstractSipBeneficiariosAud implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipBeneficiariosAud() {
    }

	/** minimal constructor */
    public SipBeneficiariosAud(Long consecutivo, Long numint, String usuario, Long benCod, Long benTipoIdentificacion, Long benIdentificacion, String benNombres, String benApellido1, String benSexo, String benInvalido, String benEstado, Date benFechaNac, Date benFechaRegistro) {
        super(consecutivo, numint, usuario, benCod, benTipoIdentificacion, benIdentificacion, benNombres, benApellido1, benSexo, benInvalido, benEstado, benFechaNac, benFechaRegistro);        
    }
    
    /** full constructor */
    public SipBeneficiariosAud(Long consecutivo, Long numint, String usuario, Long benCod, Long benTipoIdentificacion, Long benIdentificacion, String benNombres, String benApellido1, String benApellido2, String benDesc, String benSexo, String benInvalido, String benEstado, Date benFechaNac, Date benFechaRegistro) {
        super(consecutivo, numint, usuario, benCod, benTipoIdentificacion, benIdentificacion, benNombres, benApellido1, benApellido2, benDesc, benSexo, benInvalido, benEstado, benFechaNac, benFechaRegistro);        
    }
   
}
