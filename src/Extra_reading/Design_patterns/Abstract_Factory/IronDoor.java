package Extra_reading.Design_patterns.Abstract_Factory;

import Extra_reading.Design_patterns.Factory_Method.function;

class IronDoor implements Door {
    @Override
    public function getDescription() {
        System.out.println("echo 'I am an iron door';");
        return null;
    }
}
