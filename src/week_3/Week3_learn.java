package week_3;

import java.util.ArrayList;

public class Week3_learn {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Monk");
        teachers.add("Blink");
        teachers.add("New Monk");
        teachers.add("New Blinky");
        teachers.add("Jovialu");
        teachers.add("Romanov");
        teachers.add("Tacker");
        int i = 0;
        i++;
        teachers.listIterator(i);
        System.out.println(i++ +"" +teachers);
        System.out.println("the number o teachers is: "+ teachers.size());

        System.out.println("first teacher is: "+ teachers.get(0));
        System.out.println("last teacher is: "+ teachers.get(6));
        teachers.remove("Blink");
        System.out.println(".remove(object) "+i++ +"" +teachers);
        if (teachers.contains("Blink")){
            System.out.println("Blink is here!");
        }else {
            System.out.println("Blink is on holiday");
        }
        teachers.add(1, "Blink Reborn");//inject object to index
        System.out.println(".add(index, element)"+i++ +"" +teachers);
        teachers.add("Blink the Third");//add object last in line
        System.out.println(".add(object)"+ i++ +"" +teachers);


        System.out.println(i++ +"" +teachers);
    }
}
//17.1 Methods of ArrayLists
//ArrayList provides us with many useful methods:
//public static void main(String[] args) {
//    ArrayList<String> teachers = new ArrayList<String>();
//
//    teachers.add("Anthony");
//    teachers.add("Barto");
//    teachers.add("Paul");
//    teachers.add("John");
//    teachers.add("Martin");
//    teachers.add("Matt");
//
//    System.out.println("the number of teachers " + teachers.size() );
//
//    System.out.println("first teacher on the list " + teachers.get(0));
//    System.out.println("third teacher on the list " + teachers.get(2));
//
//    teachers.remove("Barto");
//
//    if (teachers.contains("Barto")) {
//        System.out.println("Barto is on the teachers list");
//    } else {
//        System.out.println("Barto is not on the teachers list");
//    }
//}
//First a list of strings is created and then 6 names added to it. size tells us the amount
// of strings in the list. Note: when the method is called, the call should have the following
// format: teachers.size(). First comes the name of the object, then follows a dot followed by
// the name of the method.
//The strings will be in the list in the order in which they were added to it. By calling the
// method get(i), we get
// the value from the index (location) i in the list. The indexing of items in the list starts
// from 0. This means that the first added string is located at index 0, the second at index 1,
// and so on.
//We can remove strings from lists through the method remove. The method can be used in two
// ways. First, remove("characters") removes the string given as a parameter. Second,
// remove(3) removes the 4th String from the list.
//At the end of the example, the method contains is called. This method is used for asking
// the list if it contains the string given as a parameter. If it does, the method returns
// the value true.
//Program output:
//the number of teachers 6
//first teacher on the list Anthony
//third teacher on the list Paul
//Barto is not on the teachers list
//Note! The methods remove and contains assume that the objects stored in the ArrayList do
// have an equals method.
// We will get back to this later in the course.