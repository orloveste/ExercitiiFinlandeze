package week_1;

import java.util.Scanner;

public class Ex8_Adder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        int sumOfNumbers = firstNumber+secondNumber;
        System.out.println("\nSum of the numbers: "+sumOfNumbers);
    }
}
//Exercise 8: Adder
//Create a program that asks the user for two integers and then prints their sum.
//Type a number: 6
//Type another number: 2
//
//Sum of the numbers: 8
//
//In this example the user input is marked in red color. From now on the red color will indicate user input in examples.