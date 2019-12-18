package week_1;

import java.util.Scanner;

public class Ex14_A_positive_number {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int toCompareNumber = Integer.parseInt(reader.nextLine());
        if (toCompareNumber >= 0) {
            System.out.println("\nThe number is positive.");
        } else {
            System.out.println("\nThe number is not positive.");
        }
    }
}
//Exercise 14: A positive number
//Create a program that asks the user for a number and tells if the number is positive (i.e. greater than zero).
//Type a number: 5
//
//The number is positive.
//
//Type a number: -2
//
//The number is not positive.
//
//Are you certain that your code is indented correctly?
//Reread the section on code indentation. Observe what happens when you press shift, alt and f simultaneously! The same
// automatic indentation functionality can also be used using the menu bar by selecting Source and then Format.
