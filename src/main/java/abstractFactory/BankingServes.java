package abstractFactory;

import abstractFactory.banking.BankingTeamFactory;

public class BankingServes {
    public static void main(String[] args) {
        TeamCreatorFactory teamFactory = new BankingTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager pm = teamFactory.getProjectManager();
        System.out.println("banking serves");
        developer.writeCode();
        tester.testProject();
        pm.manageProject();
    }
}
