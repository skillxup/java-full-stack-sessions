import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArraysandWrapperClass {
    public static void main(String[] args) {
        // integer class implements comparable 
        // inteface so we can use the sort method 
        int[] arr = {11, 55, 22, 0, 89};
        Arrays.sort(arr);
        
        // string class implements comparable 
        // inteface so we can use the sort method 
        System.out.println("Sorted Int Array: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Sorted String Array: ");
        String[] names = {"Steve", "Ajeet", "Kyle"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        // string class implements comparable 
        // inteface so we can use the sort method 
        System.out.println("Sorted List: ");
        List fruits = new ArrayList();
        
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Guava");
        fruits.add("Grapes");

        Collections.sort(fruits);
        for(String s: fruits) System.out.println(s + ", ");

    }    
}
