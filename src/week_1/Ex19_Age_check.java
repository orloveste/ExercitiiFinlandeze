package week_1;

import java.util.Scanner;

public class Ex19_Age_check {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How old are you? ");
        int introducedAge = Integer.parseInt(reader.nextLine());
        if (introducedAge >= 0 && introducedAge <= 120){
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
