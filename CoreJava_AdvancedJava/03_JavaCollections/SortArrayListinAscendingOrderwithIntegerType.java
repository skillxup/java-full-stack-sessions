import java.util.*;
public class SortArrayListinAscendingOrderwithIntegerType {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(13);
        arrayList.add(33);
        arrayList.add(12);
        arrayList.add(24);

        System.out.println("Before Sorting: " + arrayList);

        Collections.sort(arrayList);
        System.out.println("After Sorting: " + arrayList);
    }
}
