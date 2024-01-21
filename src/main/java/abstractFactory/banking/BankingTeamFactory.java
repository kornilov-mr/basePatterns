package abstractFactory.banking;

import abstractFactory.Developer;
import abstractFactory.ProjectManager;
import abstractFactory.TeamCreatorFactory;
import abstractFactory.Tester;

public class BankingTeamFactory implements TeamCreatorFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new PMBanking();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }
}
