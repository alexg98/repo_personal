package co.com.coomeva.sipas.util.fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Utilfechas {	
	
	private Utilfechas() {}
	
	public final static  String YYYY_MM_DD = "yyyy-MM-dd";
	public static final String YYYYMMDD = "YYYYMMDD";
	
	public static Date getDateFromString(String fecha) {
		return getDateFromString(fecha, YYYY_MM_DD);
	}
	
	public static Date getDateFromString(String fecha, String pattern) {
		try {
			return new SimpleDateFormat(pattern).parse(fecha);
		} catch (ParseException e) {
			throw new RuntimeException("Error convirtiendo fecha : " + fecha,e);
		}
	}	
}
