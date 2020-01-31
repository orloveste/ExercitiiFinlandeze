package Extra_reading.Design_patterns.Abstract_Factory;

class IronDoorFactory implements DoorFactory{
    @Override
    public Door makeDoor() {
        return new IronDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Welder();
    }
}
