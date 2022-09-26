import java.util.Vector;
import java.util.ArrayList;

public class ConvertVectorToArrayList {
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

        System.out.println("ArrayList Elements: ");
        ArrayList<String> arraylist = new ArrayList<String>(vector);
        for(String s: arraylist) {
            System.out.println(s);
        }
    }    
}
