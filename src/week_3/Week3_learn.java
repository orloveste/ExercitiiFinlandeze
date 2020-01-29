package week_3;

public class Week3_learn {
    public static void main(String[] args) {
        String word = "aesthetically";

        int index = word.indexOf("tic");
        System.out.println(word.substring(index));

        index = word.indexOf("ally");
        System.out.println(word.substring(index));

        index = word.indexOf("book");
        System.out.println(index);
        System.out.println(word.substring(index));
    }
}
//15.3 Other methods for strings
//Methods in the String class also make it possible to search for a specific word in
// text. For example, the word "or" can be found in the word "Horse". A method called
// indexOf() searches for the word given as a parameter in a string. If the word is
// found, it returns the starting index (location), remember that the numbering starts
// from 0 of the word. If the word is not found, the method returns the value -1.
//String word = "aesthetically";
//
//int index = word.indexOf("tic"); // index value will be 6
//System.out.println(word.substring(index)); //prints "tically"
//
//index = word.indexOf("ally"); //index value will be 9
//System.out.println(word.substring(index)); //prints "ally"
//
//index = word.indexOf("book"); // string "aesthetically" does not include "book"
//System.out.println(index); //prints -1
//System.out.println(word.substring(index)); //error!