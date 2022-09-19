import java.util.*;
public class SortEnteredArrayListInDescendingOrder {
    public static void main(String[] args) {
        int i = 0, size;
        Scanner scan = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.println("how many elements you want in a list?");
        size = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter elements: ");
        while(i < size) {
            list.add(scan2.nextLine());
            i++;
        }

        System.out.println("Before Sorting: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After Sorting: " + list);
    }
}
