import java.util.ArrayList;
public class CreatingCopyOfArrayListClone {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("apple");
        al.add("orange");
        al.add("mango");
        al.add("grapes");

        System.out.println("ArrayList: " + al);

        ArrayList<String> al2 = (ArrayList<String>)al.clone();
        System.out.println("Shallow copy of ArrayList: " + al2);
        System.out.println("---------------------------------------");
        
        al.add("banana");
        al.remove("orange");

        // Print both ArrayList after add and remove
        System.out.println("Original ArrayList: " + al);
        System.out.println("Cloned ArrayList: " + al2);
    }
}
