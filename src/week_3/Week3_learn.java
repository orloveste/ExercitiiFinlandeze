package week_3;

public class Week3_learn {
    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Insert 'dog' or 'cat'");

/*//        String animal = "Dog";
        String animal = "Cat";

        if (animal.equals("Dog")){
            System.out.println(animal +" says bow-bow");
        } else if (animal.equals("Cat")){
            System.out.println(animal +" says meow-meow");
        }*/

        /*String banana = "banana";
        String cucumber = "cucumber";
        String together = banana+cucumber;
        System.out.println("The lenght of banana is: "+banana.length());
        System.out.println("The lenght of cucumber is: "+cucumber.length());
        System.out.println("The word "+together+" lenght is: "+together.length());*/

        String word = "Supercalifragilisticexpialidocious";
        char character = word.charAt(33);
//        char character = word.charAt(word.length());
        System.out.println(word.length());
        System.out.println("The 4th character of the word is "+character);
    }
}
//   15. Strings of characters
//In this section, we take a closer look at strings of characters in Java, which are
// called Strings. We have already used variables of String type when printing, and
// learned how to compare Strings. Comparing two strings is performed by calling the
// equals() method of the string.
//String animal = "Dog";
//
//if( animal.equals("Dog") ) {
//    System.out.println(animal + " says bow-wow");
//} else if ( animal.equals("Cat") ) {
//    System.out.println(cat + " says meow meow");
//}
//It is possible to ask the string how many characters long it is by writing .length()
// after it's name. In other words, we are calling its length() method.
//String banana = "banana";
//String cucumber = "cucumber";
//String together = banana + cucumber;
//
//System.out.println("The length of banana is " + banana.length());
//System.out.println("The length of  cucumber is " + cucumber.length());
//System.out.println("The word " + together + " length is " + together.length());
//In the above code, the method length() is called for three different strings. The
// call banana.length() calls only the method that gives the length of the string
// banana, while cucumber.length() calls the method that gives the length of the
// string cucumber etc. The left part before the dot says whose method is called.
//Java has a special data type, called char, to be used for characters. A char
// variable can store only one character. A string variable can return a character
// from a specific location in itself with the method charAt() that uses the index
// of the location as a parameter. Note that counting the index of the character
// starts from zero!
//String word = "Supercalifragilisticexpialidocious";
//
//char character = word.charAt(3);
//System.out.println("The 4th character of the word is " + character); //prints "e"
//The characters in a string are numbered (indexed) starting from 0. This means
// that we can reach the last character in a string with number (or index) "the
// length of the word minus one", or word.charAt(word.length()-1). The following
// example will make the program crash, because we are trying to get a character
// from an index that does not exist.
//char character = word.charAt(word.length());
//A tip for using NetBeans
//You can find all the NetBeans tips here
//Renaming
//Variables, methods and classes (we will learn about these in the next set) need
// to have descriptive names. Often, a name is not that describing and needs to be
// changed. In NetBeans, it is really easy to rename things. Just select and "paint"
// the name you want to change with the mouse. Then press ctrl and r simultaneously,
// and write the new name.
//Exercise 47: The length of a name