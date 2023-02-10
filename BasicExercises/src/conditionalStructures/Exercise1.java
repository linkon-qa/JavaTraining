package conditionalStructures;

import java.util.Scanner;

/*
* Make a program to read one integer values,
* and then say if that number is positive or negative.
* */
public class Exercise1 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter with a integer number");
        a = scanner.nextInt();
        if (a >= 0) {
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
        scanner.close();
    }
}