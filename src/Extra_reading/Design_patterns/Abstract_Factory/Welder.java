package Extra_reading.Design_patterns.Abstract_Factory;

import Extra_reading.Design_patterns.Factory_Method.function;

class Welder implements DoorFittingExpert {
    @Override
    public function getDescription() {
        System.out.println("echo 'I can only fit iron doors';");
        return null;
    }
}
