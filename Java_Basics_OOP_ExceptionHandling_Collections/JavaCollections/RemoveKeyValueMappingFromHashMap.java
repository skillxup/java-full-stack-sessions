import java.util.HashMap;
public class RemoveKeyValueMappingFromHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

        hashmap.put(11, "Value1");
        hashmap.put(22, "Value2");
        hashmap.put(33, "Value3");
        hashmap.put(44, "Value4");
        hashmap.put(55, "Value5");
        hashmap.put(66, "Value6");

        System.out.println("HashMap Elements: " + hashmap);

        Object removedElement1 = hashmap.remove(33);
        System.out.println("Element removed is: " + removedElement1);

        Object removedElement2 = hashmap.remove(55);
        System.out.println("Element removed is: " + removedElement2);

        System.out.println("After Remove: ");
        System.out.println("HashMap Elements: " + hashmap);
    }
}
