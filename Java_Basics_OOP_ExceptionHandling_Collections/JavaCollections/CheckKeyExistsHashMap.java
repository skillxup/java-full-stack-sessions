import java.util.HashMap;
public class CheckKeyExistsHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

        hashmap.put(11, "Value1");
        hashmap.put(22, "Value2");
        hashmap.put(33, "Value3");
        hashmap.put(44, "Value4");
        hashmap.put(55, "Value5");
        hashmap.put(66, "Value6");

        boolean flag = hashmap.containsKey(22);
        System.out.println("Key 22 exists in HashMap? " + flag);

        boolean flag2 = hashmap.containsKey(2);
        System.out.println("Key 2 exists in HashMap? " + flag2);
    }
}
