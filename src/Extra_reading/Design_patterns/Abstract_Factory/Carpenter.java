package Extra_reading.Design_patterns.Abstract_Factory;

import Extra_reading.Design_patterns.Factory_Method.function;

class Carpenter implements DoorFittingExpert{
    @Override
    public function getDescription() {
        System.out.println("echo 'I can only fit wooden doors';");
        return null;
    }
}
