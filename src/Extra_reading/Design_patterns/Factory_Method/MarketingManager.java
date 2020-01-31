package Extra_reading.Design_patterns.Factory_Method;

abstract class MarketingManager extends HiringManager{
    @Override
    protected function makeInterviewr() /*: Interviewer*/{//todo super?
        return new ComunityExecutive();
    }
}
