package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double dollarToReais(double price , double dollars){
        return dollars*(1+0.06)*price;
    }
}
