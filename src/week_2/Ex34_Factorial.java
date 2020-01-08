package week_2;

import java.util.Scanner;

public class Ex34_Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int numberForFactorial = Integer.parseInt(reader.nextLine());
        int counter = 1;
        int factorial = 1;
        while (counter<=numberForFactorial){
            factorial = counter*factorial;
            counter++;
        }
        System.out.println("Factorial is "+factorial);
    }
}
//Exercise 34: Factorial
//Create a program that calculates the factorial of the number n. The factorial n! is calculated
// using the formula 1*2*3*...*n. For example 4! = 1*2*3*4 = 24. Additionally, it is defined
// that 0! = 1.
//Example outputs:
//Type a number: 3
//Factorial is 6
//
//Type a number: 10
//Factorial is 3628800