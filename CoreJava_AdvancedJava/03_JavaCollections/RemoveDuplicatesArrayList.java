import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;

public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();

        al.add("ajay");
        al.add("becky");
        al.add("chaitanya");
        al.add("ajay");
        al.add("rocky");
        al.add("becky");

        System.out.println("Before: ");
        System.out.println("ArrayList Contains: " + al);

        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.addAll(al);

        al.clear();

        al.addAll(lhs);

        System.out.println("After: ");
        System.out.println("ArrayList Contains: " + al);
    }    
}
