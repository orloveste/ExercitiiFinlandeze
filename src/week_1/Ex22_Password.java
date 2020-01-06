package week_1;

import java.util.Scanner;

public class Ex22_Password {
    public static void main(String[] args) {
        String password = "carrot";
        String secretMessage = "Well done!";
        while (true) {
            System.out.print("Type the password: ");
            Scanner readerPassword = new Scanner(System.in);
            String command = readerPassword.nextLine();
            if (command.equals(password)) {
                System.out.println("Right!\n\nThe secret is: "+secretMessage);
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