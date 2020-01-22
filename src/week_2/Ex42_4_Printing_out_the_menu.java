package week_2;

import java.util.Scanner;

public class Ex42_4_Printing_out_the_menu {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("************");
        System.out.println("* Hangman *");
        System.out.println("************\n");
        printMenu();
        System.out.println();
        while (hangman.gameOn()){
            System.out.println("Type a comand:");
            String command = reader.nextLine();
            if (command.isEmpty()){
                System.out.println("String is empty");
                printMenu();
            } else if (command.length()==1){
                hangman.guess(command);
            } else if (command.equalsIgnoreCase("status")){
                hangman.printStatus();
            } else if (command.equalsIgnoreCase("quit")){
                System.out.println("Thank you for playing!");
                break;
            } /*else if (command.isEmpty()){
                System.out.println("String is empty");
                printMenu();
            }*/
            else {
                System.out.println();
            }
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
//Exercise 42.4: Printing out the menu
//If the user types an empty string of characters, meaning a string that has zero length,
// you need to call the method printMenu. Note that the method printMenu is not in the
// Hangman game but in your own program.
//Note: checking if the string is empty is done as follows:
//String winnie = "the pooh";
//if(winnie.isEmpty()) {
//    System.out.println("String was empty");
//} else {
//    System.out.println("I found something!");
//}