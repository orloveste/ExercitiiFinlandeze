package Extra_reading.Design_patterns.Factory_Method;

public abstract class HiringManager {
    private Object Interviewer;

    abstract protected function makeInterviewr()/* : Interviewer*/; //todo identify
    public void takeInterview(){
        /*$interviewer = $this->*/ makeInterviewr();// todo wtf
        /*$interviewer->*/askQuestions();//todo same
    }

    protected abstract void askQuestions();
}
