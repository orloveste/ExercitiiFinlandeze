package Extra_reading.Design_patterns.Factory_Method;

class ComunityExecutive implements Interviewer {
    @Override
    public function askQuestions() {
        System.out.println("echo 'Asking about community building';");
        return null;
    }
}
