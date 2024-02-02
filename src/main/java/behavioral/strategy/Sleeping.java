package behavioral.strategy;

import behavioral.strategy.Activity;

public class Sleeping implements Activity {
    @Override
    public void doIt() {
        System.out.println("dev sleeps...");
    }
}
