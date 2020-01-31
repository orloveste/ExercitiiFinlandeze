package Extra_reading.Design_patterns.Factory_Method;

abstract class HiringManager {
    abstract protected Interviewer makeInterviewr();

    public Interviewer takeInterview() {
        Interviewer interviewer = this.makeInterviewr();
        interviewer.askQuestions();
        return interviewer;
    }
}

