package week_1;

import java.util.Scanner;

public class Ex16_Even_or_odd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if ((number%2) == 0) {
            System.out.println("Number "+number+" is even.");
        } else {
            System.out.println("Number "+number+" is odd.");
        }
    }
}
//Exercise 16: Even or odd?
//Create a program that asks the user for a number and tells whether the number is even or odd.
//Type a number: 2
//Number 2 is even.
//
//Type a number: 7
//Number 7 is odd.
//
//Hint: The number's remainder when dividing by 2 tells whether the number is even or odd. The remainder can be obtained
// with the % operator.