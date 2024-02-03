package behavioral.visitor;

public class JuniorDev implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("jun dev is writting project class");
    }

    @Override
    public void create(DateBase dateBase) {
        System.out.println("jun dev is writting data base");

    }

    @Override
    public void create(Test test) {
        System.out.println("jun dev is writting test");

    }
}
