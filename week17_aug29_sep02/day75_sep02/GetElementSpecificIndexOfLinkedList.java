import java.util.LinkedList;

public class GetElementSpecificIndexOfLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();

        linkedlist.add("AA");
        linkedlist.add("BB");
        linkedlist.add("CC");
        linkedlist.add("DD");
        linkedlist.add("EE");
        linkedlist.add("FF");

        System.out.println("LinkedIn Elements: ");
        for(int i = 0; i < linkedlist.size(); i++) {
            System.out.println("Element at index: " + i + " is: " + linkedlist.get(i));
        }
    }    
}
