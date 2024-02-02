package behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GitHubRepo gitHubRepo = new GitHubRepo();

        project.setVersion("version 1.0");
        System.out.println(project);

        gitHubRepo.setSave(project.save());

        project.setVersion("version 2.0");
        System.out.println(project);

        project.load(gitHubRepo.getSave());
        System.out.println(project);
    }
}
