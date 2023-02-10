package repeatingStructures;

import java.util.Scanner;

/*
* Make a program to say if a password is correct or invalid, the correct password is 2002
* */
public class Exercise1 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter with a password with 4 digits");
        a = scanner.nextInt();
        while(a != 2002){
            System.out.println("Password is wrong , try again");
            a = scanner.nextInt();
       }
        System.out.println("Password is correct!");
        scanner.close();
    }
}