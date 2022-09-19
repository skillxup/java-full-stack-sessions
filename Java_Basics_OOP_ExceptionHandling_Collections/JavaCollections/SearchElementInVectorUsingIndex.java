import java.util.Vector;
public class SearchElementInVectorUsingIndex {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();

        vector.add("hank");
        vector.add("flynn");
        vector.add("wlater");
        vector.add("hank");
        vector.add("flynn");
        vector.add("tom");
        vector.add("jerry");
        vector.add("tom");

        System.out.println("Vector Elements before Sorting: ");
        for(int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        int first_index = vector.indexOf("flynn");
        System.out.println("First Occurance of flynn: " + first_index);

        int last_index = vector.lastIndexOf("flynn");
        System.out.println("Last Occurance of flynn: " + last_index);
    }
}
