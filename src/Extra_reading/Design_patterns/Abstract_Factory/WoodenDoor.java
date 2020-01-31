package Extra_reading.Design_patterns.Abstract_Factory;

import Extra_reading.Design_patterns.Factory_Method.function;

public class WoodenDoor implements Door {
    @Override
    public function getDescription() {
        System.out.println("echo 'I am a wooden door';");
        return null;
    }
}
