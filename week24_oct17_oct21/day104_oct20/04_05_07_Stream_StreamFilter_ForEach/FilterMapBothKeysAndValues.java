import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

class FilterMapBothKeysAndValues {
    public static void main(String[] args) {
        Map<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(1, "Apple");
        hmap.put(2, "Orange");
        hmap.put(3, "Kiwi");
        hmap.put(4, "Banana");

        Map<Integer, String> result = hmap.entrySet()
            .stream()
            .filter(p -> p.getKey().intValue() <= 3)
            .filter(map -> map.getValue().startsWith("A"))
            .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println("Result: " + result);
    }
}
