package Extra_reading.Design_patterns.Factory_Method;

public class Runner {
    public static void main(String[] args) {
        DevelopmentManager devManager = new DevelopmentManager();
        devManager.takeInterview();
        MarketingManager marketingManager = new MarketingManager();
        marketingManager.takeInterview();
    }
}
