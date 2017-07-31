package hdvnweb.common.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * Validation Support
 * 
 * @author Eagle
 *
 */
public final class ValidatorSupport {
	
	private static final String PHONE_NUMERIC_FORMAT = "\\(\\d{4}\\)-\\d{3}-\\d{4}";
	private static final String EMAIL_FORMAT = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
	private static final String DATE_FORMAT = "\\d{4}-\\d{2}-\\d{2}";
	
	public static boolean checkMaxLength(String value, int length) {
		return StringUtils.length(value) <= length;
	}
	
	public static boolean checkMinLength(String value, int length) {
		return StringUtils.length(value) >= length;
	}
	
	public static boolean checkRangthLength(String value, int min, int max) {
		return StringUtils.length(value) >= min && StringUtils.length(value) <= max; 
	}
	
	public static boolean checkFixedLength(String value, int length) {
		return StringUtils.length(value) == length;
	}
	
	public static boolean checkRequired(String value) {
		return StringUtils.isNotEmpty(value);
	}
	
	public static boolean  checkNumeric(String value) {
		return StringUtils.isNumeric(value);
	}
	
	public static boolean  checkAlphabertOnly(String value) {
		return StringUtils.isAlpha(value);
	}
	
	public static boolean  checkAlphabertNumeric(String value) {
		return StringUtils.isAlphanumeric(value);
	}
	
	public static boolean checkPhoneNumeriFormat(String value) {
		return value.matches(PHONE_NUMERIC_FORMAT);
	}
	
	public static boolean checkEmailFormat(String value) {
		return value.matches(EMAIL_FORMAT);
	}
	
	public static boolean checkDateFormat(String value) {
		return value.matches(DATE_FORMAT);
	}
	
	 
}
