package behavioral.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        Developer junior = new JuniorDev();

        Developer senior = new SeniorDev();

        project.beWritten(junior);

        project.beWritten(senior);
    }
}
