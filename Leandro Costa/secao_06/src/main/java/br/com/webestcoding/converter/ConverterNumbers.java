package br.com.webestcoding.converter;

public class ConverterNumbers {
	public static Double convertToDouble(String strNumber) {
		if (strNumber == null) {
			return 0D;
		}
		String number = strNumber.replace(",", ".");
		if (isNumeric(number)) {
			return Double.parseDouble(number);
		}
		return null;
	}

	public static boolean isNumeric(String strNumber) {
		if (strNumber == null) {
			return false;
		}
		String number = strNumber.replace(",", ".");
		return number.matches("[-+]?\\d*\\.?\\d+");
	}
}
