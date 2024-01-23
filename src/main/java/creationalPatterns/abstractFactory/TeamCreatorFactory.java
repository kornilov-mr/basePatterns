package creationalPatterns.abstractFactory;

public interface TeamCreatorFactory {
    Developer getDeveloper();
    ProjectManager getProjectManager();
    Tester getTester();
}
