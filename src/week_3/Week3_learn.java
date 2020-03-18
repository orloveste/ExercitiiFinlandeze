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
        System.out.println("sout array = "+ teachers);
        int place = 0;
        teachers.add("test to add 2");
        while (place < teachers.size()){
            System.out.println(teachers.get(place));
            place++;
        }
        System.out.println("sout array 2= "+teachers);
        teachers.add("After hour Beach");// not take in print or array
        System.out.println("sout array 3= "+teachers);
    }
}
//17.2 Going through an ArrayList
//In the following example 4 names are added to the list. Then the whole list is printed:
//public static void main(String[] args) {
//    ArrayList<String> teachers = new ArrayList<String>();
//
//    teachers.add("Anthony");
//    teachers.add("Paul");
//    teachers.add("John");
//    teachers.add("Martin");
//
//    System.out.println( teachers.get(0) );
//    System.out.println( teachers.get(1) );
//    System.out.println( teachers.get(2) );
//    System.out.println( teachers.get(3) );
//}
//This solution works, but is really clumsy. What if there were more items in the list? Or
// less? What if we
// would not know how many items there are?