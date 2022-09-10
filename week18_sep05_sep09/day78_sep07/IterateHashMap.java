import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class IterateHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        
        hmap.put(11, "AB");
        hmap.put(2,"CD");
        hmap.put(33, "EF");
        hmap.put(9, "HG");
        hmap.put(3, "JI");

        // for loop
        System.out.println("For Loop: ");
        for(Map.Entry me: hmap.entrySet()) {
            System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
        }

        // while loop and iterator
        System.out.println("While Loop: ");
        Iterator iterator = hmap.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry me2 = (Map.Entry) iterator.next();
            System.out.println("Key: " + me2.getKey() + " & Value: " + me2.getValue());
        }
    }    
}
