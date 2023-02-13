import util.CurrencyConverter;
import java.util.Scanner;

public class Main {
    /*
     * Write a program to calculator the convertor to dollar to  reais
     * */
    public static void main(String[] args) {
        double dollars, price, reais;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the dollar price? ");
        price = scanner.nextDouble();
        System.out.println("How many dollars will be bought? ");
        dollars = scanner.nextDouble();
        reais = CurrencyConverter.dollarToReais(price,dollars);
        System.out.println("Amount to be paid in reais "+reais);
        scanner.close();
    }
}