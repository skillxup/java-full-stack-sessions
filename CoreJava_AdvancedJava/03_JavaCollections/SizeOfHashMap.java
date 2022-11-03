import java.util.HashMap;
public class SizeOfHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(11, "AB");
        hmap.put(2, "CD");
        hmap.put(33, "EF");
        hmap.put(9, "HG");
        hmap.put(3, "JI");

        System.out.println("Size of HashMap: " + hmap.size());
    }
}
