import java.util.Hashtable;

public class CheckKeyValueExistenceInHashTable {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<String, String>();

        hashtable.put("A", "Apple");
        hashtable.put("B", "Orange");
        hashtable.put("C", "Mango");
        hashtable.put("D", "Banana");
        hashtable.put("E", "Grapes");

        boolean keyFlag1 = hashtable.containsKey("A");
        System.out.println("Key A exists in HashTable?: " + keyFlag1);

        boolean keyFlag2 = hashtable.containsKey("D");
        System.out.println("Key D exists in HashTable?: " + keyFlag2);

        boolean keyFlag3 = hashtable.containsKey("G");
        System.out.println("Key G exists in HashTable?: " + keyFlag3);

        boolean vFlag1 = hashtable.containsValue("Orange");
        System.out.println("Value Orange exists in HashTable?: " + vFlag1);

        boolean vFlag2 = hashtable.containsValue("XYZ");
        System.out.println("Value XYZ exists in HashTable?: " + vFlag2);

        boolean vFlag3 = hashtable.containsValue("Grapes");
        System.out.println("Value Grapes exists in HashTable?: " + vFlag3);

    }    
}
