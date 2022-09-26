import java.util.*;
class ArrayListSize {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(23);
        numbers.add(45);
        numbers.add(-64);

        System.out.println("Elements in ArrayList: " + numbers);
        System.out.println("Number of elements in ArrayList: " + numbers.size());
    }
}
