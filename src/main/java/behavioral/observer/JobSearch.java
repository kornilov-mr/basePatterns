package behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDevJobSite jobSite = new JavaDevJobSite();
        jobSite.addVacancy("first java position");
        jobSite.addVacancy("second java position");

        Observer subscriber1 = new Subscriber("sweed");
        Observer subscriber2 = new Subscriber("artur");

        jobSite.addObserver(subscriber1);
        jobSite.addObserver(subscriber2);

        jobSite.addVacancy("third java position");
        jobSite.removeVacancy("first java position");
    }
}
