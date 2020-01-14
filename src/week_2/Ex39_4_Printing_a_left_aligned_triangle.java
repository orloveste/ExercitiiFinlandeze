package week_2;

public class Ex39_4_Printing_a_left_aligned_triangle {
    public static void main(String[] args) {
        printTriangle(4);
    }

    public static void printTriangle(int size) {
        int counter = 0;
        while (counter <= size){
            printStars(counter);
            System.out.println();
            counter++;
        }
    }
    public static void printStars(int amount){
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
    }
}
//Exercise 39.4: Printing a left-aligned triangle
//Create the method printTriangle(int size) that prints a triangle using the printStars method.
// The method call printTriangle(4), for example, has the following output:
//*
//**
//***
//****