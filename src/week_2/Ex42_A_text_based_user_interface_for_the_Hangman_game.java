package week_2;

import java.util.Scanner;

public class Ex42_A_text_based_user_interface_for_the_Hangman_game {
//    hangman.gameOn();
//    hangman.printStatus();
//    hangman.printWord();
//    hangman.printMan();
//    hangman.guess(String letter);
//
//
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("************");
        System.out.println("* Hangman *");
        System.out.println("************");
        System.out.println("");
        printMenu();
        System.out.println("");



        System.out.println("Thank you for playing!");
    }

    private static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
//Exercise 42: A text-based user interface for the Hangman game
//Your friend has programmed a Hangman game for you, but the game lacks the user inferface. The Hangman
// has the following methods:
//hangman.gameOn()
//Shows if the game is on
//hangman.printStatus()
//Prints the game status. Shows how many guesses have been made and the letters that have not been used yet.
//hangman.printWord()
//Prints the word the user tries to guess. The letters that have not been guessed yet are hidden as
// question marks, like "v?ri?ble".
//hangman.printMan()
//Prints the Hangman.
//hangman.guess(String letter)
//Guesses the letter that is given as a parameter.
//You will get a program body from the exercise robot. It already contains some functionalities:
//        Scanner reader = new Scanner(System.in);
//        Hangman hangman = new Hangman();
//
//        System.out.println("************");
//        System.out.println("* Hangman *");
//        System.out.println("************");
//        System.out.println("");
//        printMenu();
//        System.out.println("");
//
//        // ADD YOUR IMPLEMENTATION HERE
//
//    System.out.println("Thank you for playing!");
//
//In addition to the program body, you will get the method called printMenu:
//    public static void printMenu() {
//        System.out.println(" * menu *");
//        System.out.println("quit   - quits the game");
//        System.out.println("status  - prints the game status");
//        System.out.println("a single letter uses the letter as a guess");
//        System.out.println("an empty line prints this menu");
//    }
//
//The exercise is completed in small steps.