package week_1;

import java.util.Scanner;

public class Sum_of_the_ages {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String firstName = reader.nextLine();
        System.out.print("Type your age: ");
        int firstAge = Integer.parseInt(reader.nextLine());
        System.out.print("\nType your name: ");
        String secondName = reader.nextLine();
        System.out.print("Type your age: ");
        int secondAge = Integer.parseInt(reader.nextLine());
        System.out.print('\n'+firstName+" and "+secondName+" are "+(firstAge+secondAge)+" years old in total.");
    }
}
//Exercise 12: Sum of the ages
//Create a program that asks for the names and ages of two users. After that the program prints the sum of their ages.
//Type your name: Matti
//Type your age: 14
//
//Type your name: Arto
//Type your age: 12
//
//Matti and Arto are 26 years old in total.