package week_2;

import java.util.Scanner;

public class Ex32_The_sum_of_a_set_of_numbers {
    public static void main(String[] args) {
        int result = 0;
        int i = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int userNumber = Integer.parseInt(reader.nextLine());
        while (i <= userNumber){
            result = i+ result;
            i++;
        }System.out.println("Sum is "+result);
    }
}
//Exercise 32: The sum of a set of numbers
//Create a program that calculates the sum 1+2+3+…+n where n is a number entered by the user.
//Example outputs:
//Until what? 3
//Sum is 6
//
//The calculation above was: 1+2+3 = 6.
//Until what? 7
//Sum is 28
//
//The calculation above was: 1+2+3+4+5+6+7 = 28.
//Hint: Create the program using the while statement. Use a helper variable in your program to remember how many
// times the block has been executed. Use also another helper variable to store the sum. During each execution
// add the value of the helper variable that counts the executions to the variable in which you should collect
// the sum.