package sequencialStructure;

import java.util.Scanner;

/*
* Make a program to read a value four values, A B C and D.  so
* show on the screen the  result of A*B - C*D .
* */
public class Exercise3 {
    public static void main(String[] args) {
    int a , b, c, d, result;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter with four values");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        result = a*b - c*d;
        System.out.printf("Result is"+ result);
        sc.close();
    }
}