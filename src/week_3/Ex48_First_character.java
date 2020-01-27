package week_3;

import java.util.Scanner;

public class Ex48_First_character {
    public static char firstCharacter(String text){
        return text.charAt(0);
    }

    public static void main(String[] args) {
        System.out.print("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();
        System.out.println("First character: "+firstCharacter(text));
    }
}
//Exercise 48: First character
//Create a program that asks for the user's name and gives the first character.
//Type your name: Paul
//First character: P
//
//Type your name: Catherine
//First character: C
//
//Note! Your program should be structured so that you put the search for the first character in
// its own method: public static char firstCharacter(String text). The tests will be testing both
// the method firstCharacter and the program overall