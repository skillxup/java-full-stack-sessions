import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("Chaitanya");
        al.add("Rahul");
        al.add("Ajeet");

        System.out.println("ArrayList elements: ");
        System.out.println(al);

        List<String> ll = new LinkedList<String>();
        ll.add("Kevin");
        ll.add("Peter");
        ll.add("Kate");

        System.out.println("LinkedList elements: ");
        System.out.println(ll);
    }    
}
