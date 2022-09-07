import java.util.LinkedList;
public class LinkedListPollMethod {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();

        linkedlist.add("Element1");
        linkedlist.add("Element2");
        linkedlist.add("Element3");
        linkedlist.add("Element4");

        System.out.println("ListLink before: " + linkedlist);
        System.out.println("Element removed: " + linkedlist.poll());
        System.out.println("ListLink before: " + linkedlist);
    }
}
