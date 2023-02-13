import entities.Rectangle;
import java.util.Scanner;

public class Main {
    /*
    * Write a program to read the width and height values of a rectangle.
    * Then show on the screen the value of its area, perimeter and diagonal.
    * */
    public static void main(String[] args) {
        double area, perimeter, diagonal;
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter with the value of width and height of a rectangle");
         rectangle.width = scanner.nextDouble();
         rectangle.height = scanner.nextDouble();
         area = rectangle.area();
         perimeter = rectangle.perimeter();
         diagonal = rectangle.diagonal();
        System.out.println("Area is "+area);
        System.out.println("Perimeter is "+perimeter);
        System.out.println("Diagonal is "+diagonal);
        scanner.close();
    }
}