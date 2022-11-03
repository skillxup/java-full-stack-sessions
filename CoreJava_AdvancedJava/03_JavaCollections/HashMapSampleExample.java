import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class HashMapSampleExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(12, "chaitanya");
        hmap.put(2, "madhu");
        hmap.put(7, "anisa");
        hmap.put(29, "saidulu");
        hmap.put(4, "murali");

        // set and display content using Iterator
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();

        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("Key is: " + mentry.getKey() + " & value is: " + mentry.getValue());
        }

        // get values based on key
        String var = hmap.get(2);
        System.out.println("Value at index 2: " + var);

        // remove values based on key
        hmap.remove(7);
        System.out.println("Map key and values after removal: ");
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.println("Key is: " + mentry2.getKey() + " & value is: " + mentry2.getValue());
        }
    }    
}
