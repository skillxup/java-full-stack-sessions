import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Collections;

public class IterateArrayListElementsusingEnumerationInterface {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("C");
        arrayList.add("C++");
        arrayList.add("Java");
        arrayList.add("Perl");

        Enumeration<String> e = Collections.enumeration(arrayList);

        System.out.println("ArrayList Elements: ");
        while(e.hasMoreElements())
            System.out.println(e.nextElement());
    }    
}
