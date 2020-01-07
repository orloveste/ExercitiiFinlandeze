package week_2;

import java.util.Scanner;

public class Ex25_Sum_of_three_numbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;
        System.out.print("Type the first number: ");
        read = reader.nextInt();
        sum = read;
        System.out.print("Type the second number: ");
        read = reader.nextInt();
        sum = sum + read;
        System.out.print("Type the third number: ");
        read = reader.nextInt();
        sum = sum + read;
        System.out.println("\nSum: "+ sum);
    }
}
//Exercise 25: Sum of three numbers
//Create a program that asks the user for three numbers and then prints their sum. Use the following
// structure in your program:
//Scanner reader = new Scanner(System.in);
//int sum = 0;
//int read;
//
//// WRITE YOUR PROGRAM HERE
//// USE ONLY THE VARIABLES sum, reader AND read!
//
//System.out.println("Sum: " + sum);
//
//Type the first number: 3
//Type the second number: 6
//Type the third number: 12
//
//Sum: 21