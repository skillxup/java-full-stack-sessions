import java.util.Vector;
import java.util.ListIterator;
import java.util.Iterator;

public class VectorIteratorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();

        vector.add("mango");
        vector.add("orange");
        vector.add("apple");
        vector.add("grapes");
        vector.add("kiwi");

        Iterator it = vector.iterator();

        System.out.println("Vector elements are: ");
        while(it.hasNext())
            System.out.println(it.next());
    }    
}
