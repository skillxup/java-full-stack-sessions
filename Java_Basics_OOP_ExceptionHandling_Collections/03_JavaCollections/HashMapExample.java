import java.util.HashMap;
class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(1, "AA");
        hmap.put(2, "BB");
        hmap.put(3, "CC");
        hmap.put(4, "DD");

        System.out.println("HashMap contains: " + hmap);
    }    
}
