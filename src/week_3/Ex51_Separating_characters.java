package week_3;

import java.util.Scanner;

public class Ex51_Separating_characters {
    public static int calculateCharacters(String text){
        return text.length();
    }
    public static void main(String[] args) {
        System.out.print("Type your name: ");
        Scanner reader = new Scanner((System.in));
        String text = reader.nextLine();
        int count = 0;
        while (calculateCharacters(text)>count){
            System.out.println(count+1 + ". character: "+ text.charAt(count));
            count++;
        }
    }
}
//Exercise 51: Separating characters
//Create a program that asks for the user's name and gives its characters separately. You
// do not need to create methods in this exercise.
//Type your name: Paul
//1. character: P
//2. character: a
//3. character: u
//4. character: l
//
//Hint: using a while loop helps in this exercise!
//Type your name: Catherine
//1. character: C
//2. character: a
//3. character: t
//4. character: h
//5. character: e
//6. character: r
//7. character: i
//8. character: n
//9. character: e