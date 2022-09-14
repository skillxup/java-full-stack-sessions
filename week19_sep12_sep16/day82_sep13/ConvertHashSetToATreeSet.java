import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class ConvertHashSetToATreeSet {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();

        hset.add("Chaitanya");
        hset.add("Rahul");
        hset.add("Tim");
        hset.add("Rick");
        hset.add("Harry");

        System.out.println("HashSet contains: " + hset);

        Set<String> tset = new TreeSet<String>(hset);

        System.out.println("TreeSet contains: ");
        for(String temp: tset) {
            System.out.println(temp);
        }
    }    
}
