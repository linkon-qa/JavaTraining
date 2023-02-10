package sequencialStructure;

import java.util.Scanner;
/*
* Make a program to read a value of the radius of a circle,
* and then show on the value of area of this circle with for decimal places.
* */
public class Exercise2 {
    public static void main(String[] args) {
    double pi = 3.14159;
    double radius, area;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter with a value of the radius of a circle");
        radius = sc.nextDouble();
        area = pi* Math.pow(radius,2);
        System.out.printf("Area=%.4f%n", area);
        sc.close();
    }
}