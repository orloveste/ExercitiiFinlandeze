package week_1;

import java.util.Scanner;

public class Ex17_Greater_number {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        if (firstNumber>secondNumber){
            System.out.println("\nGreater number: "+firstNumber);
        } else if (firstNumber<secondNumber){
            System.out.println("\nGreater number: "+secondNumber);
        } else if (firstNumber==secondNumber){
            System.out.println("\nThe numbers are equal!");
        } else {
            System.out.println("\nFatal error, don't touch!");
        }

    }
}
//Exercise 17: Greater number
//Create a program that asks the user for two numbers and prints the greater of those two. The program should also
// handle the case in which the two numbers are equal.
//Example outputs:
//Type the first number: 5
//Type the second number: 3
//
//Greater number: 5
//
//Type the first number: 5
//Type the second number: 8
//
//Greater number: 8
//
//Type the first number: 5
//Type the second number: 5
//
//The numbers are equal!
//