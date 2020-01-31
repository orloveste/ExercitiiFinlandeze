package Extra_reading.Design_patterns.Abstract_Factory;

public class Runner {
    public static void main(String[] args) {
        WoodenDoorFactory woodenFactory = new WoodenDoorFactory();
        Door door = woodenFactory.makeDoor();
        DoorFittingExpert expert = woodenFactory.makeFittingExpert();

        door.getDescription();
        expert.getDescription();

        IronDoorFactory ironFactory = new IronDoorFactory();

        door = ironFactory.makeDoor();
        expert = ironFactory.makeFittingExpert();

        door.getDescription();
        expert.getDescription();


    }
}
