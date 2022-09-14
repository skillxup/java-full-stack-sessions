import java.util.TreeMap;

public class RemoveKeyValueMappingFromTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treemap = new TreeMap<String, String>();

        treemap.put("key1", "Jack");
        treemap.put("key2", "Rick");
        treemap.put("key3", "Kate");
        treemap.put("key4", "Tom");
        treemap.put("key5", "Steve");
        treemap.put("key6", "Ram");

        System.out.println("Before: TreeMap contains: " + treemap);

        Object removedElement = treemap.remove("key3");
        System.out.println("Removed Element: " + removedElement);

        System.out.println("After: TreeMap contains: " + treemap);
    }    
}
