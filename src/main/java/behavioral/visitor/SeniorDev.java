package behavioral.visitor;

public class SeniorDev implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("senior dev is writting project class");

    }

    @Override
    public void create(DateBase dateBase) {
        System.out.println("senior dev is writting date base");

    }

    @Override
    public void create(Test test) {
        System.out.println("senior dev is writting test");

    }
}
