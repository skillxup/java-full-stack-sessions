import java.util.Vector;
import java.util.List;
import java.util.Collections;

public class ConvertVectorToList {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();

        vector.add("tim");
        vector.add("rock");
        vector.add("hulk");
        vector.add("rick");
        vector.add("james");

        System.out.println("Vector Elements: ");
        for(String str: vector) {
            System.out.println(str);
        }

        List<String> list = Collections.list(vector.elements());

        System.out.println("List Elements: ");
        for(String str2: list) {
            System.out.println(str2);
        }
    }    
}
