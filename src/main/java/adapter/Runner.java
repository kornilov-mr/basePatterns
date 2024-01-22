package adapter;

public class Runner {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJaveToDatabase();
        dataBase.insert();
        dataBase.remove();
        dataBase.select();
        dataBase.update();
    }
}
