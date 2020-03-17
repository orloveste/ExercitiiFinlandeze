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

        System.out.println(teachers.get(0));
        System.out.println(teachers.get(1));
        System.out.println(teachers.get(2));
        System.out.println(teachers.get(3));
        System.out.println(teachers.get(4));
        System.out.println(teachers.get(5));
        System.out.println(teachers.get(6));
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