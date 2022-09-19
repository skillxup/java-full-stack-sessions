import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

public class SortHashMapKeysValues {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(11, "AB");
        hmap.put(2, "CD");
        hmap.put(33, "EF");
        hmap.put(9, "HG");
        hmap.put(3, "JI");


        System.out.println("Before Sorting: ");
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();

        while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.println(me.getKey() + ": ");
            System.out.print(me.getValue());
        }

        System.out.println("After Sorting: ");
        Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();

        while(iterator2.hasNext()) {
            Map.Entry me2 = (Map.Entry) iterator2.next();
            System.out.println(me2.getKey() + ": ");
            System.out.print(me2.getValue());
        }
    }    
}
