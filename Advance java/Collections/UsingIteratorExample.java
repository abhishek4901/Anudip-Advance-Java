import java.util.ArrayList;
import java.util.Iterator;

public class UsingIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Using Iterator to traverse the list
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String item = itr.next();
            System.out.println(item);
        }
    }
}