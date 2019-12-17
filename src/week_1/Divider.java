package week_1;

import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        double divider = (double) firstNumber/secondNumber;
        System.out.println("\nDivision: "+firstNumber+" / "+secondNumber+" = "+divider);
    }
}
//Exercise 9: Divider
//Create a program that asks the user for two integers and prints their quotient. Make sure that 3 / 2 = 1.5. If the decimal part is missing, take another look at 5.1 Floating point numbers (decimal numbers) to find the solution.
//Type a number: 3
//Type another number: 2
//
//Division: 3 / 2 = 1.5