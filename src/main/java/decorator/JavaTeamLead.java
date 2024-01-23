package decorator;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }
    public String sendWeekReport(){
        return "send week report";
    }

    @Override
    public String makejob() {
        return super.makejob()+sendWeekReport();
    }
}
