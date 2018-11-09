package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Date;
import java.util.Set;


/**
 * SipReclamaciones generated by MyEclipse - Hibernate Tools
 */
public class SipReclamaciones extends AbstractSipReclamaciones implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipReclamaciones() {
    }

	/** minimal constructor */
    public SipReclamaciones(Long recCodigo, Date recFechaRegistro, Date recFechaReclamacion) {
        super(recCodigo, recFechaRegistro, recFechaReclamacion);        
    }
    
    /** full constructor */
    public SipReclamaciones(Long recCodigo, Date recFechaRegistro, Date recFechaReclamacion, Date recFechaEvento, String recOfRadicacion, String recOficinaReclamacion, String recEstado, Long asoNumint, String recUserAsign, String recTratEsp, String recRecibido, Set sipDetalleReclamacioneses, Long recPagoManual, String recCiudadSercofun,Long indContinuidad,Long recTipAnulacion,String recUsuarioError,Long recCanal, Long recReclamacionPadre,Long recValorRetencionAuxilio, String recAnticipo) {
        super(recCodigo, recFechaRegistro, recFechaReclamacion, recFechaEvento, recOfRadicacion, recOficinaReclamacion, recEstado, asoNumint, recUserAsign, recTratEsp, recRecibido, sipDetalleReclamacioneses, recPagoManual, recCiudadSercofun,indContinuidad,recTipAnulacion,recUsuarioError,recCanal, recReclamacionPadre, recValorRetencionAuxilio, recAnticipo);        
    }
   
}