package entities;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double dollarToReal(double priceDollar, double amount) {
        return priceDollar * amount * (1 + IOF);
    }

}