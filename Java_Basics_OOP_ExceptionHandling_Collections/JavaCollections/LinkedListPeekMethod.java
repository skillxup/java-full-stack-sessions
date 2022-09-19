import java.util.LinkedList;
public class LinkedListPeekMethod {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();

        linkedlist.add("delhi");
        linkedlist.add("agra");
        linkedlist.add("mysore");
        linkedlist.add("chennai");
        linkedlist.add("pune");

        System.out.println("LinkedList before: " + linkedlist);
        System.out.println(linkedlist.peek());
        System.out.println("LinkedList before: " + linkedlist);
    }
}
