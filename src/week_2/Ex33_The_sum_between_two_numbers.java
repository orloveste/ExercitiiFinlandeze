package week_2;

import java.util.Scanner;

public class Ex33_The_sum_between_two_numbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int firstInput = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int lastInput = Integer.parseInt(reader.nextLine());
        int counter = firstInput;
        int sum = 0;
        while (counter <= lastInput){
           sum = sum+counter;
           counter++;
        }System.out.println("The sum "+sum);

    }
}
//Exercise 33: The sum between two numbers
//Similar to the previous exercise, except that the program should ask for both the lower and upper bound.
// You can assume that the users first gives the smaller number and then the greater number.
//Example outputs:
//First: 3
//Last: 5
//The sum 12
//
//First: 2
//Last: 8
//The sum is 35
//