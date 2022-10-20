import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

class FilterMapByValues {
    public static void main(String[] args) {
        Map<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(1, "Apple");
        hmap.put(2, "Orange");
        hmap.put(3, "Kiwi");
        hmap.put(4, "Banana");

        Map<Integer, String> result = hmap.entrySet()
            .stream()
            .filter(map -> "Orange".equals(map.getValue()))
            .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println("Result: " + result);
    }
}
