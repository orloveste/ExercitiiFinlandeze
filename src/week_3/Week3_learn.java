package week_3;

import java.util.ArrayList;

public class Week3_learn {
    public static void main(String[] args) {
        ArrayList<String> bleahList = new ArrayList<>();
        bleahList.add("Monk");
        bleahList.add("Blink");
        System.out.println(bleahList);
        bleahList.clear();
        bleahList.add("New Monk");
        bleahList.add("New Blinky");
        System.out.println(bleahList);
    }
}
//17. ArrayList or an "object container"
//Often during programming, we would like to keep many different strings in memory. A very
// bad idea would be to define a variable for each of them: :
//String word1;
//String word2;
//String word3;
//// ...
//String word10;
//This would be such a good-for-nothing solution that it does not almost need an explanation
// -- think of this approach for a word count of 100 or 1000!
//Just like other modern programming languages, Java gives us different tools to store many
// objects neatly in our programs. Now, we take a closer look at ArrayList, which is probably
// the most used object container in Java.
//The following lines of code make use of an ArrayList that holds specifically objects of type
// String. A couple of strings are stored into the list.
//import java.util.ArrayList;
//
//public class ListProgram {
//
//    public static void main(String[] args) {
//        ArrayList<String> wordList = new ArrayList<String>();
//
//        wordList.add("First");
//        wordList.add("Second");
//    }
//}
//In the above main program method, the first row creates a new ArrayList called wordList,
// which can be used as a
// container for String variables. The type of the ArrayList is ArrayList<String>, which
// means that the ArrayList is meant for storing Strings. The list is created using the
// command new ArrayList<String>();.
//Note: to make the ArrayList work, we must first write an import statement at the beginning
// of the program either import java.util.ArrayList; or import java.util.*;
//When the list is created, two strings are added by calling the list method add. The list
// will not run out of space, so theoretically the list can contain any amount of Strings
// (as long as they fit in the computer's memory).
//Internally an ArrayList is -- as its name suggests -- a list. The added strings
// automatically go to the end of the ArrayList.