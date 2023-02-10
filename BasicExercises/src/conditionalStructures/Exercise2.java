package conditionalStructures;

import java.util.Scanner;

/*
* Make a program to read one integer values,
* and then say if that number is positive or negative.
* */
public class Exercise2 {
    public static void main(String[] args) {
        float x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter with two numbers, x and y in the cartesian plane");
        x = scanner.nextFloat();
        y = scanner.nextFloat();

        if(x != 0 && y !=0) {
            if (x > 0) {
                if (y > 0) {
                    System.out.println("The number is in Q1");
                } else {
                    System.out.println("The number is in Q2");
                }
            } else {
                if (y > 0) {
                    System.out.println("The number is in Q4");
                } else {
                    System.out.println("The number is in Q3");
                }
            }
        }
        else{
            if(x==0 && y == 0){
                System.out.println("The number is in the origin");
            }
            else{
                if(x==0){
                    System.out.println("The number is in the X axis ");
                }
                else{
                    System.out.println("The number is in the Y axis ");
                }
            }
        }
        scanner.close();
    }
}