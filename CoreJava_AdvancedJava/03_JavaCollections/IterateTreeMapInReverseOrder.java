import java.util.*;
public class IterateTreeMapInReverseOrder {
    public static void main(String[] args) {
        Map<String, String> treemap = new TreeMap<String, String>(Collections.reverseOrder());

        treemap.put("key1", "Jack");
        treemap.put("key2", "Rick");
        treemap.put("key3", "Kate");
        treemap.put("key4", "Tom");
        treemap.put("key5", "Steve");

        Set set = treemap.entrySet();
        Iterator i = set.iterator();

        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.println("Key: " + me.getKey() + ", Value: " + me.getValue());
        }
    }
}
