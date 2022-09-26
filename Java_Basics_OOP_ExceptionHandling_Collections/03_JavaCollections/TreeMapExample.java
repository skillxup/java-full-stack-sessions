import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = 
            new TreeMap<Integer, String>();

        tmap.put(1, "data1");
        tmap.put(2, "data2");
        tmap.put(6, "data3");
        tmap.put(4, "data4");

        Set set = tmap.entrySet();
        Iterator iterator = set.iterator();

        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("Key is : " + mentry.getKey() + " & Value : " + mentry.getValue());
        }
    }
}