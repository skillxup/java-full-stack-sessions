import java.util.*;
public class RemovingDuplicatesUsingIterator {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(10, 20, 20, 30, 40, 50, 30, 10));

        System.out.println("Original ArrayList: " + arrList);
        System.out.println("-----------------------------------");

        ArrayList<Integer> newList = new ArrayList<Integer>();
        for(Integer element: arrList) {
            if(!newList.contains(element)) {
                newList.add(element);
            }
        }

        System.out.println("After Duplicates Removing ArrayList: " + newList);
        System.out.println("-----------------------------------");
    }
}
