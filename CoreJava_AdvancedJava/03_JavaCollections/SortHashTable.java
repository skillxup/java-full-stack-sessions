import java.util.*;

public class SortHashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        
        ht.put(10, "Ajeet");
        ht.put(23, "Jain");
        ht.put(65, "Test");
        ht.put(56, "Demo");
        ht.put(37, "Anuj");

        Set set = ht.entrySet();

        Iterator i = set.iterator();

        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
        }
    }    
}
