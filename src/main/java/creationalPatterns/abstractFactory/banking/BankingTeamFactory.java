package creationalPatterns.abstractFactory.banking;

import creationalPatterns.abstractFactory.Developer;
import creationalPatterns.abstractFactory.ProjectManager;
import creationalPatterns.abstractFactory.TeamCreatorFactory;
import creationalPatterns.abstractFactory.Tester;

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
