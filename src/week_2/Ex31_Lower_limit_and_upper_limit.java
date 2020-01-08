package week_2;

import java.util.Scanner;

public class Ex31_Lower_limit_and_upper_limit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int lastNumber = Integer.parseInt(reader.nextLine());
        while (firstNumber <= lastNumber) {
            System.out.println(firstNumber);
            firstNumber++;
        }
    }
}
//Exercise 31: Lower limit and upper limit
//Create a program that asks the user for the first number and the last number and then prints all numbers
// between those two.
//First: 5
//Last: 8
//5
//6
//7
//8
//
//If the first number is greater than the last number, the program prints nothing:
//First: 16
//Last: 12
//
//Note: Remember that the lower and upper limits can also be negative!