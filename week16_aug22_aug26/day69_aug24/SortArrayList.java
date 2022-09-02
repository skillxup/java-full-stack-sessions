import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("PineApple");

        System.out.println("Original ArrayList: ");
        for(String str: fruits) {
            System.out.println(str);
        }

        Collections.sort(fruits);

        System.out.println("Sorted ArrayList: ");
        for(String str: fruits) {
            System.out.println(str);
        }
    }    
}
