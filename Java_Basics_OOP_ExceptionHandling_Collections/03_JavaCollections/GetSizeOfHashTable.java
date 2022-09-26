import java.util.Hashtable;

public class GetSizeOfHashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();

        hashtable.put(11, "AA");
        hashtable.put(22, "BB");
        hashtable.put(33, "CC");
        hashtable.put(44, "DD");
        hashtable.put(55, "EE");

        System.out.println("Size of Hashtable: " + hashtable.size());
    }    
}
