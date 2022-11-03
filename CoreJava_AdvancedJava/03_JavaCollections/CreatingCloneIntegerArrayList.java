import java.util.ArrayList;
public class CreatingCloneIntegerArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(4);
        numbers.add(9);
        numbers.add(2);
        numbers.add(5);

        System.out.println("Original ArrayList: " + numbers);

        ArrayList<Integer> copyList = (ArrayList<Integer>)numbers.clone();
        System.out.println("Cloned ArrayList: " + copyList);
    }
}
