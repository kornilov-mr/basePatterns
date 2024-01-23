package creationalPatterns.builder;

public class EnterPriseBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprise web site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFPRESSO);
    }

    @Override
    void buildPrice() {
        website.setCost(50000);
    }
}
