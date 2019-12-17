package week_1;

import java.util.Scanner;

public class Calculating_the_circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        double circumference = (double) radius*Math.PI*2;
        System.out.println("\nCircumference of the circle: "+circumference);
    }
}
//Exercise 10: Calculating the circumference
//The circumference of a circle is calculated using the formula 2 * pi * radius. Create a program that asks the user for the radius and then calculates the circumference using the given radius. Java already contains the value of pi in the Math.PI variable, which you can use in your calculation.
//Type the radius: 20
//
//Circumference of the circle: 125.66370614359172