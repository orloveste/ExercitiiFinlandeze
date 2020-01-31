package Extra_reading.Design_patterns.Factory_Method;

class MarketingManager extends HiringManager{
    @Override
    protected Interviewer makeInterviewr(){
        return new ComunityExecutive();
    }
}
