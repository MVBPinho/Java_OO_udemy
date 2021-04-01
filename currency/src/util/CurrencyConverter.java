package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double amountToBePaid(double many, double dollar) {
		return (many + (many * IOF)) * dollar;
	}
}