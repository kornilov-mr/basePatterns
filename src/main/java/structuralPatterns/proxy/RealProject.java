package structuralPatterns.proxy;

public class RealProject implements Project{
    private String URL;

    public RealProject(String URL) {
        this.URL = URL;
        load();
    }
    public void load( ){
        System.out.println("loading project from " +URL + "...");
    }

    @Override
    public void run() {
        System.out.println("running project from " +URL + "...");
    }
}
