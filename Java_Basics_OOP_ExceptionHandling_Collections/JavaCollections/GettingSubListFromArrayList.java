import java.util.List;
import java.util.ArrayList;
public class GettingSubListFromArrayList {
    public static void main(String[] args) {
        try {
            ArrayList<String> al = new ArrayList<String>();

            al.add("steve");
            al.add("justin");
            al.add("ajeet");
            al.add("john");
            al.add("arnold");

            System.out.println("Original ArrayList Content: " + al);
            System.out.println("-----------------------------------");

            ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));

            System.out.println("SubList of ArrayList Content: " + al2);
            System.out.println("-----------------------------------");
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Exception while getting sublist: " + e);
        }
    }    
}
