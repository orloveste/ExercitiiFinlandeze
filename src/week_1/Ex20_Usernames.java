package week_1;

import java.util.Scanner;

public class Ex20_Usernames {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your username: ");
        String username = reader.nextLine();
        System.out.print("Type your password: ");
        String password = reader.nextLine();
        if (!(username.equalsIgnoreCase("alex") && password.equalsIgnoreCase("mightyducks"))){
            if (!(username.equalsIgnoreCase("emily") && password.equalsIgnoreCase("cat"))){
                System.out.println("Your username or password was invalid!");
            } else {
                System.out.println("You are now logged into the system!");
            }
        }else {
            System.out.println("You are now logged into the system!");
        }
    }
}
//Exercise 20: Usernames
//Create a program that recognizes the following users:
//Username
//Password
//alex
//mightyducks
//emily
//cat
//The program should check for the username and password as follows:
//Type your username: alex
//Type your password: mightyducks
//You are now logged into the system!
//
//Type your username: emily
//Type your password: cat
//You are now logged into the system!
//
//Type your username: emily
//Type your password: dog
//Your username or password was invalid!
//
//Note: Remember that you cannot compare strings with the == operation!