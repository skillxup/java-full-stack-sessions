import java.util.ArrayList;
public class FindingArrayListSize {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("Initial Size: " + al.size());

        al.add(3);
        al.add(12);
        al.add(43);
        al.add(76);

        System.out.println("After Added Items, Size: " + al.size());

        al.remove(1);
        al.remove(2);

        System.out.println("After Removing Items, Size: " + al.size());

    }
}
