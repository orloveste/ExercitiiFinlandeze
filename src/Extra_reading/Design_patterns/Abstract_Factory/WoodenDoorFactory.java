package Extra_reading.Design_patterns.Abstract_Factory;

class WoodenDoorFactory implements  DoorFactory{
    @Override
    public Door makeDoor()/*: Door */{
        return new WoodenDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Carpenter();
    }
}
