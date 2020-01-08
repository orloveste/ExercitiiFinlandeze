package week_2;

import java.util.Scanner;

public class Ex35_sum_of_the_powers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int power =0;
        int result = 0;
        while (number >= power) {
            int powOfNumbers = (int) Math.pow(2, power);
            result = result + powOfNumbers;
            power++;
        }
        System.out.println("The result is "+result);
    }
}
//Exercise 35: Sum of the powers
//Create a program that calculates the sum of 20+21+22+...+2n, where n is a number entered by the user.
// The notation 2i means raising the number 2 to the power of i, for example 24 = 2*2*2*2 = 16. In Java
// we cannot write ab directly, but instead we can calculate the power with the command Math.pow(number,
// power). Note that the command returns a number of double type (i.e. floating point number). A double
// can be converted into the int type (i.e. whole number) as follows: int result = (int)Math.pow(2, 3).
// This assigns the value of 23 to variable result.
//Example outputs:
//Type a number: 3
//The result is 15
//
//Type a number: 7
//The result is 255