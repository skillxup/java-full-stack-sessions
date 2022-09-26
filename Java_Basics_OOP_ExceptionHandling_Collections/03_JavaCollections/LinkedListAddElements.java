import java.util.*;
public class LinkedListAddElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("steve");
        list.add("carl");
        list.add("raj");

        list.addFirst("umesh");
        list.addLast("uman");

        list.add(2, "lenuios");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
