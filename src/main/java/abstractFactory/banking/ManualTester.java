package abstractFactory.banking;

import abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testProject() {
        System.out.println("manual Tester tests code");
    }
}
