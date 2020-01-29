package week_3;

import java.util.Scanner;

public class Ex55_A_word_inside_a_word {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String firstWord = reader.nextLine();
        System.out.print("Type the second word: ");
        String secondWord = reader.nextLine();
//        int index = firstWord.indexOf(secondWord);
//        int index = firstWord.indexOf(secondWord.length());
//        String compareString = String.valueOf(secondWord.compareToIgnoreCase(firstWord));
//        int finalIndex = secondWord.length();
//        int finalIndex = firstWord.codePointCount(secondWord);
//        System.out.println(compareString);
        if (firstWord.contains(secondWord)){
            System.out.println("The word '"+secondWord+"' is found in the word '"+firstWord+"'.");
        } else {
            System.out.println("The word '"+secondWord+"' is not found in the word '"+firstWord+"'.");
        }
    }
}
 /*while (true){
            System.out.println("The word '"+firstWord.substring(index)+"' is found in the word '"+firstWord+"'.");
            break;
        }
        System.out.println("The word '"+secondWord+"' is not found in the word '"+firstWord+"'.");*///test1
 /*if (true){
            System.out.println("The word '"+firstWord.substring(index)+"' is found in the word '"+firstWord+"'.");
        }else {
            System.out.println("The word '"+secondWord+"' is not found in the word '"+firstWord+"'.");
        }*///test2
//Exercise 55: A word inside a word
//Create a program that asks the user for two words. Then the program tells if the second
// word
// is included in the first word. Use String method indexOf in your program.
//Type the first word: glitter
//Type the second word: litter
//The word 'litter' is found in the word 'glitter'.
//
//Type the first word: glitter
//Type the second word: clean
//The word 'clean' is not found in the word 'glitter'.
//
//Note: Make your program outputs (prints) match exactly the example above!