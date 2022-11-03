import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
public class SynchronizeHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(2, "Anil");
        hmap.put(3, "Ajit");
        hmap.put(5, "Brad");
        hmap.put(8, "Sachin");
        hmap.put(13, "Peter");
        hmap.put(18, "John");

        Map map = Collections.synchronizedMap(hmap);
        Set set = map.entrySet();

        synchronized(map) {
            Iterator i = set.iterator();
            while(i.hasNext()) {
                Map.Entry me = (Map.Entry)i.next();
                System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
            }
        }
    }
}
