import java.util.Vector;
import java.util.ListIterator;

public class VectorListIteratorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();

        vector.add("Item1");
        vector.add("Item2");
        vector.add("Item3");
        vector.add("Item4");
        vector.add("Item5");
        vector.add("Item6");

        ListIterator litr = vector.listIterator();

        System.out.println("Traversing in Forward Direction");
        while(litr.hasNext())
            System.out.println(litr.next());

        System.out.println("Traversing in Backward Direction");
        while(litr.hasPrevious())
            System.out.println(litr.previous());
    }    
}
