import java.util.*;

public class CreatingVectorObject {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>(2);

        vec.addElement("apple");
        vec.addElement("banana");
        vec.addElement("mango");
        vec.addElement("orange");

        System.out.println("Size is: " + vec.size());
        System.out.println("Default capacity increment is: " + vec.capacity());

        // display vector elements
        Enumeration en = vec.elements();
        System.out.println("Elements are: ");
        while(en.hasMoreElements())
            System.out.println(en.nextElement() + ", ");
    }
}