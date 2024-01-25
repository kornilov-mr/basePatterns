package behavioral.iterator;

public class DevRunner {
    public static void main(String[] args) {
        String[] skills = {"java","c++","td"};
        Dev dev = new Dev("max",skills);
        Iterator iterator = dev.getIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.getNext().toString()+" ");
        }
    }
}
