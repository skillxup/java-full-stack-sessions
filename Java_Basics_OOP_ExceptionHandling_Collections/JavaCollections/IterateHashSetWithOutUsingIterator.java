import java.util.HashSet;
import java.util.Set;

class IterateHashSetWithOutUsingIterator {
    public static void main(String[] args) {
        Set<String> hset = new HashSet<String>();

        hset.add("Chaitanya");
        hset.add("Rahul");
        hset.add("Tim");
        hset.add("Rick");
        hset.add("Harry");

        for(String temp: hset) {
            System.out.println(temp);
        }
    }
}