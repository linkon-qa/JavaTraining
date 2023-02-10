package repeatingStructures;

import java.util.Scanner;

/*
 * Make a program to read an integer N and calculator all your divisors
 * */
public class Exercise2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer Number");
        n = scanner.nextInt();
        for(int j = n; j>0 ;j--){
            if(n%j == 0){
                System.out.println(j);
            }
        }
        scanner.close();
    }
}