package Extra_reading.Design_patterns.Simple_Factory;

public class RunnerSimpleFac {
    public static void main(String[] args) {
        Door door = DoorFactory.makeDoor(100, 200);

        System.out.println("Width: "+ door.getWidth());
        System.out.println("Height: "+door.getHeight());
        System.out.println();
        door = DoorFactory.makeDoor(50,100);
        System.out.println(door);

    }
}
