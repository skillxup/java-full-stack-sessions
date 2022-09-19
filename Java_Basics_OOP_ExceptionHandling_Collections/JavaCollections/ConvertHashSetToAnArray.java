import java.util.HashSet;
public class ConvertHashSetToAnArray {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();

        hset.add("Chaitanya");
        hset.add("Rahul");
        hset.add("Tim");
        hset.add("Rick");
        hset.add("Harry");

        System.out.println("HashSet contains: " + hset);

        String[] array = new String[hset.size()];
        hset.toArray(array);

        System.out.println("Array elements: ");
        for(String temp: array) {
            System.out.println(temp);
        }
    }
}
