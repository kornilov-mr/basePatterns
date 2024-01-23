package creationalPatterns.abstractFactory.banking;

import creationalPatterns.abstractFactory.ProjectManager;

public class PMBanking implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("PM manages the project");
    }
}
