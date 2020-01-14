package week_2;

import java.util.Scanner;

public class Ex38_Many_prints {
    public static void main(String [] args){
        System.out.println("How many?");
        Scanner reader = new Scanner(System.in);
        int repeatComand = reader.nextInt();
        for (int i = 0; i < repeatComand; i++) {
            printText();
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
//Exercise 38: Many prints
//Develop the program by adding the following feature: the main program should ask the user how
// many times the text should be printed (meaning how many times the method is called).
//public static void main(String[] args) {
//    // ask the user how many times the text should be printed
//    // use the while structure to call the printText method several times
//}
//
//public static void printText() {
//    // write your code here
//}
//
//The program output:
//How many?
//7
//In the beginning there were the swamp, the hoe and Java.
//In the beginning there were the swamp, the hoe and Java.
//In the beginning there were the swamp, the hoe and Java.
//In the beginning there were the swamp, the hoe and Java.
//In the beginning there were the swamp, the hoe and Java.
//In the beginning there were the swamp, the hoe and Java.
//In the beginning there were the swamp, the hoe and Java.