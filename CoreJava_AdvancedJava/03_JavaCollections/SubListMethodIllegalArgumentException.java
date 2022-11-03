import java.util.ArrayList;
import java.util.List;

public class SubListMethodIllegalArgumentException {
    public static void main(String[] args) {
        try {
            ArrayList<String> al = new ArrayList<String>();
            al.add("steve");
            al.add("justin");
            al.add("ajeet");
            al.add("john");
            al.add("arnold");

            System.out.println("Original ArrayList Content: " + al);

            List<String> list = al.subList(2, 3);
            System.out.println("SubList: " + list);
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Exception while getting subList - IndexOutOfBoundsException: " + e);
        } catch(IllegalArgumentException e) {
            System.out.println("Exception while getting subList - IllegalArgumentException: " + e);
        }
    }    
}
