package week_3;

import java.util.Scanner;

public class Ex47_The_lenght_of_a_name {
    public static int calculateCharacters(String text){
        return text.length();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String text = reader.nextLine().toLowerCase();
        System.out.println("Number of characteres: "+ calculateCharacters(text)/*text.length()*/);
    }
}
//Exercise 47: The length of a name
//Create a program that asks for the user's name and says how many characters the name
// contains.
//Type your name: Paul
//Number of characters: 4
//
//Type your name: Catherine
//Number of characters: 9
//
//Note!Your program should be structured so that you put the calculating of the name
// length in it's own method: public static int calculateCharacters(String text). The
// tests will be testing both the method calculateCharacters and the program overall.