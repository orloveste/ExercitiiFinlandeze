package week_1;

import java.util.Scanner;

public class Age_of_majoprity {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());
        if (age >= 18){
            System.out.println("\nYou have reached the age of majority!");
        } else {
            System.out.println("\nYou have not reached the age of majority yet!");
        }
    }
}
//Exercise 15: Age of majority
//Create a program that asks for the user's age and tells whether the user has reached the age of majority (i.e. 18 years old or older).
//How old are you? 12
//
//You have not reached the age of majority yet!
//
//How old are you? 32
//
//You have reached the age of majority!
//