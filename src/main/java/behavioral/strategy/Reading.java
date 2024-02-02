package behavioral.strategy;

import behavioral.strategy.Activity;

public class Reading implements Activity {
    @Override
    public void doIt() {
        System.out.println("dev reads...");
    }
}
