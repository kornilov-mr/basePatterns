package behavioral.template;

public abstract class WebsiteTemplate {
    public void showPage(){
        System.out.println("header");
        showPageContent();
        System.out.println("footer");
    }
    public abstract void showPageContent();
}
