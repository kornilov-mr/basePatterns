package prototype;

public class VersionControllerRunner {
    public static void main(String[] args) {
        Project project = new Project(1,"testProject","Source code = new Source");
        ProjectFactory factory = new ProjectFactory(project);

        System.out.println(project);
        Project projectCopy = factory.cloneProject();
        System.out.println(projectCopy);
    }
}
