package Extra_reading.Design_patterns.Abstract_Factory;

import Extra_reading.Design_patterns.Factory_Method.function;

public class WoodenDoor implements Door {
    @Override
    public function getDescription() {
        /*echo 'I am a wooden door';*/ //todo wtf
        System.out.println("Wooden door");
        return null;
    }
}
