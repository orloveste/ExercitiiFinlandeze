package Extra_reading.Design_patterns.Factory_Method;

abstract class DevelopmentManager extends HiringManager {
    @Override
    protected function makeInterviewr() /*: Interviewer */{//todo make super class
        return new Developer();
    }
}
