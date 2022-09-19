import java.util.*;
public class InitializingArrayListMultipleElements {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>(Collections.nCopies(10, 5));
        System.out.println("ArrayList Items: " + intList);
    }
}
