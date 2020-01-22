package week_2;

import java.util.Scanner;

public class Ex42_5_Printing_the_man_and_the_word {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();
        int count = 0;
        System.out.println("************");
        System.out.println("* Hangman *");
        System.out.println("************\n");
        printMenu();
        System.out.println();
        while (hangman.gameOn()){
            System.out.println("Type a comand:");
            String command = reader.nextLine();
            if (command.equalsIgnoreCase("quit")){
                System.out.println("Thank you for playing!");
                break;
            } else if (command.length()==1){
                hangman.guess(command);
            } else if (command.equalsIgnoreCase("status")){
                hangman.printStatus();
            } else {
                System.out.println();
            }
            count++;
            System.out.println(count);
            hangman.printMan();
            hangman.printWord();
        }
    }
    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
//Exercise 42.5: Printing the man and the word
//If the user has not typed the command quit, you should call the Hangman game commands
// hangman.printMan() and hangman.printWord() at the end of the loop.
//...
//Type a command:
//a
//The letter a is not in the word.
// ____
// |
// |
// |
// |
///|\
//Word to be guessed: ????
//
//Type a command:
//m
//The letter m was found in the word!
// ____
// |
// |
// |
// |
///|\
//Word to be guessed: m???
//
//Type a command:
//quit
//Thank you for playing!