package week_2;

import java.util.Scanner;

public class Ex42_2_Printing_the_status {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("************");
        System.out.println("* Hangman *");
        System.out.println("************");
        System.out.println("");
        printMenu();
        System.out.println("");
        while (hangman.gameOn()){
            System.out.println("Type a comand:");
            String command = reader.nextLine();
            if (command.equalsIgnoreCase("quit")){
                System.out.println("Thank you for playing!");
                break;
            } else if (command.equalsIgnoreCase("status")){
                hangman.printStatus();
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
//Exercise 42.2: Printing the status
//If the user gives the command "status", print the status using the method hangman.printStatus().
//************
//* Hangman *
//************
//
//* menu *
//quit   - quits the game
//status - prints the game status
//a single letter uses the letter as a guess
//an empty line prints this menu
//
//Type a command:
//status
//You have not made any guesses yet.
//Unused letters: abcdefghijklmnopqrstuvwxyz
//
//Type a command:
//quit
//Thank you for playing!
