import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class GetSubListOfLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();

        linkedlist.add("AA");
        linkedlist.add("BB");
        linkedlist.add("CC");
        linkedlist.add("DD");
        linkedlist.add("EE");
        linkedlist.add("FF");

        System.out.println("LinkedIn Elements: ");
        Iterator it = linkedlist.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        List sublist = linkedlist.subList(2, 4);

        System.out.println("\n Sub List Elements: ");
        Iterator subit = sublist.iterator();

        while(subit.hasNext()) {
            System.out.println(subit.next());
        }

        linkedlist.remove("CC");
        System.out.println("\n LinkedList Elements After Remove: ");
        Iterator it2 = linkedlist.iterator();

        while(it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
