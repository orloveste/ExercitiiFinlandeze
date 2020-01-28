package week_3;

import java.util.Scanner;

public class Ex52_Reversing_a_name {
    public static void main(String[] args) {
        System.out.print("Type your name: ");
        Scanner reader = new Scanner((System.in));
        String text = reader.nextLine();
        int count = text.length()-1;
        System.out.print("In reverse order: ");
        while (0<= count){
            System.out.print(text.charAt(count));
            count--;
        }
    }
}
//Exercise 52: Reversing a name
//Create a program that asks for the user's name and prints it in reverse order. You do not
// need to create a separate method for this.
//Type your name: Paul
//In reverse order: luaP
//
//Type your name: Catherine
//In reverse order: enirehtaC