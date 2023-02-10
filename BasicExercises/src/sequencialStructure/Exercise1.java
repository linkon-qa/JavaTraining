package sequencialStructure;

import java.util.Scanner;
/*
* Make a program to read two integer values,
* and then show on the screen the sum of these numbers with an explanatory message
* */
public class Exercise1 {
    public static void main(String[] args) {
    int a,b;
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter with two numbers");
        a = Integer.parseInt(scanner.nextLine());
        b = Integer.parseInt(scanner.nextLine());
        System.out.println("Sum is = "+ (a+b));
        scanner.close();
    }
}