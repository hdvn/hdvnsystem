package hdvnweb.common.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Convert for LocalDateTime,  LocalDate
 * @author Eagle
 *
 */
public final class ConvertingSupport {

	public static LocalDateTime convertFromStringToDateTime(String value) {
		LocalDateTime date = LocalDateTime.parse(value, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		
		return date;
	}
	
	public static LocalDate convertFromStringToDate(String value) {
		LocalDate date = LocalDate.parse(value, DateTimeFormatter.ISO_LOCAL_DATE);
		
		return date;
	}
	
	public static String convertFromDateTimeToString(LocalDateTime dateTime) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
		
		return dateTime.format(fmt);
	}
	
	public static String convertFromDateToString(LocalDate date) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		
		return date.format(fmt);
	}
}
