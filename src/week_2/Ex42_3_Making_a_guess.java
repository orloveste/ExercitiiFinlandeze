package week_2;

import java.util.Scanner;

public class Ex42_3_Making_a_guess {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("************");
        System.out.println("* Hangman *");
        System.out.println("************\n");
        printMenu();
        System.out.println("");
        while (hangman.gameOn()){
            System.out.println("Type a comand:");
            String command = reader.nextLine();
            if (command.length()==1){
                hangman.guess(command);
            } else if (command.equalsIgnoreCase("status")){
                hangman.printStatus();
            } else if (command.equalsIgnoreCase("quit")){
                System.out.println("Thank you for playing!");
                break;
            }
            else {
                System.out.println();
            }
        }
    }
    private static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
//Exercise 42.3: Making a guess
//If the user types in a single letter as a command, use it to make a guess. Guessing a
// letter occurs in the method hangman.guess(command). The guessing command has its own
// printing functionality, which it uses to print more information about the guess.
//Hint: finding out if the command is a single letter is done as follows:
//String command = reader.nextLine();
//
//if(command.length() == 1) {  // command has only one letter, so it must be a guess
//    hangman.guess(command);
//}
//
//...
//Type a command:
//a
//The letter a is not in the word.
//
//Type a command:
//b
//The letter b is not in the word.
//
//Type a command:
//c
//The letter c was found in the word!
//
//Type a command:
//quit
//Thank you for playing!