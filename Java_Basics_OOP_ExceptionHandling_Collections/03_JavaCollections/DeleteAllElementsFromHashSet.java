import java.util.HashSet;
public class DeleteAllElementsFromHashSet {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();

        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");

        hset.add("Apple");
        hset.add("Mango");

        hset.add(null);
        hset.add(null);

        System.out.println("Before: HashSet contains: " + hset);

        hset.clear();

        System.out.println("After: HashSet contains: " + hset);
    }
}
