import java.util.HashMap;
public class RemoveAllMappingFromHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

        hashmap.put(11, "Value1");
        hashmap.put(22, "Value2");
        hashmap.put(33, "Value3");
        hashmap.put(44, "Value4");
        hashmap.put(55, "Value5");
        hashmap.put(66, "Value6");

        System.out.println("HashMap Elements: " + hashmap);

        hashmap.clear();
        
        System.out.println("After Remove: ");
        System.out.println("HashMap Elements: " + hashmap);
    }
}
