package builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setbuilder( new visitCardWebsiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);
    }

}
