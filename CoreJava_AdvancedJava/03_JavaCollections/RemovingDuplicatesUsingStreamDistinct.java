import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicatesUsingStreamDistinct {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(10, 20, 56, 98, 45, 20, 56, 18));

        System.out.println("ArrayList with Duplicates: " + arrList);
        System.out.println("--------------------------------");

        List<Integer> newList = arrList.stream().distinct().collect(Collectors.toList());

        System.out.println("ArrayList after Removing Duplicates: " + newList);
    }    
}
