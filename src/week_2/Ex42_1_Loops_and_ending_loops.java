package week_2;

import java.util.Scanner;

public class Ex42_1_Loops_and_ending_loops {
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
            }else {
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
//Exercise 42.1: Loops and ending loops
//Create a loop in the program that works as a base for the rest of the user interface. Ask the user to
// submit the command inside the loop. If the command is "quit", break the loop.
//Use the command hangman.gameOn as the condition for the while structure. The loop should look like:
//while (hangman.gameOn()) {
//    String command = reader.nextLine();
//    // ...
//}
//
//In the next set (week) of exercises, we will find out what this peculiar-looking condition for ending
// the loop is about.
//This far the program should produce the following output:
//************
//* Hangman *
//************
//
// * menu *
//quit   - quits the game
//status - prints the game status
//a single letter uses the letter as a guess
//an empty line prints this menu
//
//Type a command:
//do not quit
//
//Type a command:
//quit
//Thank you for playing!
//