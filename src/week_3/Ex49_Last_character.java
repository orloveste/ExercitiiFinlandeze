package week_3;

import java.util.Scanner;

public class Ex49_Last_character {
    public static char lastCharacter(String text){
        int lastIndex = calculateCharacters(text)-1;
        return text.charAt(lastIndex);
    }
    public static int calculateCharacters(String text){
        return text.length();
    }

    public static void main(String[] args) {
        System.out.print("Type your name: ");
        Scanner reader = new Scanner((System.in));
        String text = reader.nextLine();
        System.out.println("Last character: "+lastCharacter(text));
    }
}
//Exercise 49: Last character
//Create a program that asks for the user's name and gives the last character.
//Type your name: Paul
//Last character: l
//
//Type your name: Catherine
//Last character: e
//
//Note! Your program should be structured so that you put the search for the last character
// in its own method: public static char lastCharacter(String text). The tests will be testing
// both the method lastCharacter and the program overall.