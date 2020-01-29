package week_3;

import java.util.Scanner;

public class Ex54_The_end_part {
    public static void main(String[] args) {
        System.out.print("Type a word: ");
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();

        System.out.print("Lenght ot the end part: ");
        int index = Integer.parseInt(reader.nextLine());

        System.out.println("Result: "+ text.substring(text.length()-index));
    }
}
//Exercise 54: The end part
//Create a program that prints the end part of a word. The program asks the user for the
// word and the length of the end part. Use the substring method in your program.
//Type a word: example
//Length of the end part: 4
//Result: mple
//
//Type a word: example
//Length of the end part: 6
//Result: xample