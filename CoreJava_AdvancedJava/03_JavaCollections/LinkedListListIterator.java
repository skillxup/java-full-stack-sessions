import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListListIterator {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();

        linkedlist.add("delhi");
        linkedlist.add("agra");
        linkedlist.add("mysore");
        linkedlist.add("chennai");
        linkedlist.add("pune");

        System.out.println("Forward Iteration: ");
        ListIterator listIt = linkedlist.listIterator();
        while(listIt.hasNext()) {
            System.out.println(listIt.next());
        }

        System.out.println("Backward Iteration: ");
        while(listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }

    }    
}
