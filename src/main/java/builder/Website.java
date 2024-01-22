package builder;

public class Website {
    private String name;
    private Cms cms;
    private int cost;

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", cms='" + cms + '\'' +
                ", cost=" + cost +
                '}';
    }
}
