package creationalPatterns.builder;

public class Director {
    WebsiteBuilder builder;

    public void setbuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }
    Website buildWebsite(){
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildName();

        Website website = builder.getWebsite();
        return website;
    }
}
