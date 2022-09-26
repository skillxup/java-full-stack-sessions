import java.util.HashMap;
public class CheckValueExistsHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

        hashmap.put(11, "Value1");
        hashmap.put(22, "Value2");
        hashmap.put(33, "Value3");
        hashmap.put(44, "Value4");
        hashmap.put(55, "Value5");
        hashmap.put(66, "Value6");

        boolean flag = hashmap.containsValue("Value3");
        System.out.println("Value Value3 exists in HashMap? " + flag);

        boolean flag2 = hashmap.containsValue("Value9");
        System.out.println("Value Value9 exists in HashMap? " + flag2);
    }
}
