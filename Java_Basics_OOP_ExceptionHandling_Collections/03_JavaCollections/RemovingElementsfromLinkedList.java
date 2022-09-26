import java.util.*;

public class RemovingElementsfromLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        System.out.println("Adding of Items into LinkedList");
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

        System.out.println("----------------------------------------");
        System.out.println("Removing Items from LinkedList");
        
        list.removeFirst();
        list.removeLast();

        Iterator<String> iterator2 = list.iterator();
        while(iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
