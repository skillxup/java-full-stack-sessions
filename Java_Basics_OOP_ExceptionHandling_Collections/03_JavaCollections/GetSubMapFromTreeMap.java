import java.util.*;

public class GetSubMapFromTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treemap = new TreeMap<String, String>();

        treemap.put("key1", "Jack");
        treemap.put("key2", "Rick");
        treemap.put("key3", "Kate");
        treemap.put("key4", "Tom");
        treemap.put("key5", "Steve");
        treemap.put("key6", "Ram");

        System.out.println("TreeMap Contains: " + treemap);

        SortedMap<String, String> sortedMap = treemap.subMap("key2", "key5");

        System.out.println("TreeMap Contains: " + sortedMap);

        sortedMap.remove("key4");

        System.out.println("TreeMap Contains: " + sortedMap);
    }    
}
