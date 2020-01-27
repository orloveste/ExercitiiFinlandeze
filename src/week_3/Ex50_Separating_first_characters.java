package week_3;

import java.util.Scanner;

public class Ex50_Separating_first_characters {
    public static int calculateCharacters(String text){
        return text.length();
    }
    public static void main(String[] args) {
        System.out.print("Type your name: ");
        Scanner reader = new Scanner((System.in));
        String text = reader.nextLine();
        if (calculateCharacters(text)>=3){
            System.out.println("1. character: "+ text.charAt(0));
            System.out.println("2. character: "+ text.charAt(1));
            System.out.println("3. character: "+ text.charAt(2));
        }
    }
}
//Exercise 50: Separating first characters
//Create a program that asks for the user's name and gives its first, second and third
// characters separately. If the name length is less than three, the program prints nothing.
// You do not need to create methods in this exercise.
//Type your name: Paul
//1. character: P
//2. character: a
//3. character: u
//
//Type your name: me
//
//Note: watch closely at the output in this and the following exercise. The print needs to
// contain a space after the dot and the colon!