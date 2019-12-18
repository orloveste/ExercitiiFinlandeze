package week_1;

import java.util.Scanner;

public class Ex11_Bigger_number {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        int biggerNumber = Math.max(firstNumber, secondNumber);
        System.out.println("\nThe bigger number of the two numbers given was: " +biggerNumber);
    }
}
//Exercise 11: Bigger number
//Create a program that asks the user for two integers and then prints the larger of the two.
//Tip: When you write Math. (that is, Math followed by a dot) in NetBeans, it shows you a bunch of available
// mathematical calculations. For example, Math.cos(10) calculates the cosine of the number 10. Try to find a suitable
// tool in Math to complete this exercise! If you cannot find anything suitable or do not know how to complete the
// exercise, skip the exercise for now. We will return to the matter later on.
//Type a number: 20
//Type another number: 14
//
//The bigger number of the two numbers given was: 20