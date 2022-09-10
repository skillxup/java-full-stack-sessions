import java.io.*;
import java.util.HashMap;

public class SerializeHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

        hashmap.put(11, "Value1");
        hashmap.put(22, "Value2");
        hashmap.put(33, "Value3");
        hashmap.put(44, "Value4");
        hashmap.put(55, "Value5");
        hashmap.put(66, "Value6");

        try {
            FileOutputStream fos = 
                new FileOutputStream("hashmap.ser");

            ObjectOutputStream oos = 
                new ObjectOutputStream(fos);

            oos.writeObject(hashmap);
            oos.close();
            fos.close();

            System.out.println("Serialized HashMap data is saved in hashmap.ser");
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }    
}
