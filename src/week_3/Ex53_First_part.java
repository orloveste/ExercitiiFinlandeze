package week_3;

import java.util.Scanner;

public class Ex53_First_part {
    public static void main(String[] args) {
        System.out.print("Type a word: ");
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();

        System.out.print("Lenght of the first part: ");
        int index = Integer.parseInt(reader.nextLine());

        System.out.println("Result: " + text.substring(0,index));
    }
}
//Exercise 53: First part
//Create a program that prints the first part of a word. The program asks the user for the
// word and the length of the first part. Use the substring method in your program.
//Type a word: example
//Length of the first part: 4
//Result: exam
//
//Type a word: example
//Length of the first part: 6
//Result: exampl
//