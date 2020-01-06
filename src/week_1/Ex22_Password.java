package week_1;

import java.util.Scanner;

public class Ex22_Password {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Type the password: ");
            Scanner reader = new Scanner(System.in);
            String command = reader.nextLine();
            if (command.equals("carrot")) {
                System.out.println("Right!\n\nThe secret is: jryy qbar!");
                break;
            }
            System.out.println("Wrong!");
        }
    }
}
//Exercise 22: Password
//In this exercise we create a program that asks the user for a password. If the password is right, a secret message is shown to the user.
//Type the password: turnip
//Wrong!
//Type the password: beetroot
//Wrong!
//Type the password: carrot
//Right!
//
//The secret is: jryy qbar!
//