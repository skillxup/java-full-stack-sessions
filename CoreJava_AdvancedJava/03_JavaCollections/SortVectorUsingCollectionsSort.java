import java.util.Collections;
import java.util.Vector;

public class SortVectorUsingCollectionsSort {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();

        vector.add("wlater");
        vector.add("hank");
        vector.add("flynn");
        vector.add("tom");
        vector.add("jerry");

        System.out.println("Vector Elements before Sorting: ");
        for(int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        Collections.sort(vector);

        System.out.println("Vector Elements after Sorting: ");
        for(int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }    
}
