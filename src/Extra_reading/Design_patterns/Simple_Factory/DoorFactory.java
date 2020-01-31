package Extra_reading.Design_patterns.Simple_Factory;

public class DoorFactory {

    public static Door makeDoor(float width,float height){
        return new WoodenDoor(width, height);
    }
    /*public  Door makeDoor(width, height) {
        return new WoodenDoor();
    }*///old version - not work
}
