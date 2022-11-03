import java.util.Vector;
import java.util.Enumeration;

public class VectorEnumerationExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();

        vector.add("chaitanya");
        vector.add("shubham");
        vector.add("apoorv");
        vector.add("jin");
        vector.add("jacob");

        Enumeration en = vector.elements();

        System.out.println("Vector Elements are: ");
        while(en.hasMoreElements())
            System.out.println(en.nextElement());
    }
}