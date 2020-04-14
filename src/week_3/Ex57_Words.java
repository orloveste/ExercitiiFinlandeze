package week_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex57_Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> words =  new ArrayList<>();

        while (true) {
            System.out.print("Type a word: ");
            String wordEnter = reader.nextLine();
            if ( wordEnter.equals("") ){
                break;
            } else {
                words.add(wordEnter);
            }
        }

        System.out.println("You typed the following words:");
        for (String printWord : words) {
            System.out.println(printWord);
        }
    }
}
//    Create a program that asks the user to input words until the user types
//    in an empty String. Then the program prints the words the user gave. Try
//    the for repetition sentence here. Use an ArrayList structure in your
//    program. ArrayList is defined like this:
//        ArrayList<String> words = new ArrayList<String>();
//
//        Type a word: Mozart
//        Type a word: Schubert
//        Type a word: Bach
//        Type a word: Sibelius
//        Type a word: Liszt
//        Type a word:
//        You typed the following words:
//        Mozart
//        Schubert
//        Bach
//        Sibelius
//        Liszt
//
//        Note: an empty String can be detected this way:
//        String word = reader.nextLine();
//
//        if ( word.isEmpty() ) {  // could also be: word.equals("")
//        // word was empty, meaning that the user only pressed enter
//        }

