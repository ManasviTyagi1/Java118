package Unit3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Linklist1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            ll.remove("3rd");
            ll.addFirst("0th");
            ll.addLast("5th");
            System.out.println(ll);

        }
    }
}
