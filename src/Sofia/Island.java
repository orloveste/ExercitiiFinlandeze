package Sofia;

import static javax.swing.SwingConstants.*;

//http://sofia.cs.vt.edu/cs1114-ebooklet/chapter4.html
public class Island {
    private static Object AHEAD;

    public static void main(String[] args) {
        Jeroo ann = new Jeroo(0,0,NORTH, 1);
        add(ann);
        Jeroo andy = new Jeroo(0,2,1);
        add(andy);
        //Ann fing Andy
        ann.turn(LEFT);
        ann.turn(LEFT);
        ann.hop(1);

        //Ann give Andy a flower
        ann.give(AHEAD);

        //Andy find an disable the net
        ann.hop(2);
        ann.toss();

        //Andy place a flower at(3,2)
        andy.hop(1);
        andy.turn(RIGHT);
    }

    private static void add(Jeroo bobby) {
    }
}
