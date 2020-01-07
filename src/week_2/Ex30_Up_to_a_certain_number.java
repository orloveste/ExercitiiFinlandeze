package week_2;

import java.util.Scanner;

public class Ex30_Up_to_a_certain_number {
    public static void main(String[] args) {
        int startNumber =1;
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int numberToStop = Integer.parseInt(reader.nextLine());
        while (startNumber <= numberToStop){
            System.out.println(startNumber);
            startNumber++;
        }
    }
}
