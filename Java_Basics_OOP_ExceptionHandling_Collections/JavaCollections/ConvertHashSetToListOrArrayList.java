import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class ConvertHashSetToListOrArrayList {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();

        hset.add("Chaitanya");
        hset.add("Rahul");
        hset.add("Tim");
        hset.add("Rick");
        hset.add("Harry");

        System.out.println("HashSet contains: " + hset);

        List<String> list = new ArrayList<String>(hset);

        System.out.println("ArrayList contains: " + list);
    }    
}
