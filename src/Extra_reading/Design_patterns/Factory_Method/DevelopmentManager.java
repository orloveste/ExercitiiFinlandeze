package Extra_reading.Design_patterns.Factory_Method;

class DevelopmentManager extends HiringManager {
    @Override
    protected Interviewer makeInterviewr() {
        return new Developer();
    }
}
