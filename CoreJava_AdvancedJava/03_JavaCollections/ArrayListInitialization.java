import java.util.*;
public class ArrayListInitialization {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>(
            Arrays.asList("peter", "john", "paul", "steve")
        );
        System.out.println("String Elements are: " + obj);

        ArrayList<Integer> numbers = new ArrayList<Integer>(
            Arrays.asList(23, 87, -74, 98, 33)
        );
        System.out.println("Number Elements are: " + numbers);
    }
}
