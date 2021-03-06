// default package
// Generated 5/12/2014 10:11:59 AM by Hibernate Tools 3.4.0.CR1
package co.com.coomeva.sipas.core.model.sipasdb;
import java.math.BigDecimal;
import java.util.Date;

/**
 * SipEstatutariosVinculaciones generated by hbm2java
 */
public class SipEstatutariosVinculacionesAud implements java.io.Serializable {

	private Long consecutivo;
	private Byte estatutario;
	private Short vinculacionCodigo;
	private BigDecimal valor;
	private Date fecha; 
	private String login;

	
	
	public SipEstatutariosVinculacionesAud(Long consecutivo, Byte estatutario,
			Short vinculacionCodigo, BigDecimal valor, Date fecha, String login) {
		super();
		this.consecutivo = consecutivo;
		this.estatutario = estatutario;
		this.vinculacionCodigo = vinculacionCodigo;
		this.valor = valor;
		this.fecha = fecha;
		this.login = login;
	}

	public SipEstatutariosVinculacionesAud() {
	}

	public Long getConsecutivo() {
		return consecutivo;
	}

	public void setConsecutivo(Long consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Byte getEstatutario() {
		return estatutario;
	}

	public void setEstatutario(Byte estatutario) {
		this.estatutario = estatutario;
	}

	public Short getVinculacionCodigo() {
		return vinculacionCodigo;
	}

	public void setVinculacionCodigo(Short vinculacionCodigo) {
		this.vinculacionCodigo = vinculacionCodigo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	
}
