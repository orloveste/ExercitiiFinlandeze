package week_3;

import java.util.Scanner;

public class Ex56_Reversing_text {
    public static String reverse(String text){
        String help = "";
        int count = text.length()-1;
        while(count >= 0){
            help = help + text.charAt(count--);
        } return help;
    }

    public static void main(String[] args) {
        System.out.print("Type a text: ");
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();
        System.out.println(reverse(text));

    }

}
//Exercise 56: Reversing text
//Create the method reverse that puts the given string in reversed order. Use the following program body for the method:
//public static String reverse(String text) {
//    // write your code here
//}
//
//public static void main(String[] args) {
//    System.out.print("Type in your text: ");
//    String text = reader.nextLine();
//    System.out.println("In reverse order: " + reverse(text));
//}
//
//Hint: you probably need to build the reversed string character by character in your method. You can use a String-type variable as a helper during the building process. In the beginning, the helper variable should have an empty string of characters as a value. After this, new characters are added to the string one by one.
//String help = "";
//
//// ...
//// adding a character to the help variable
//help = help + character;
//
//Program output:
//Type a text: example
//elpmaxe
//