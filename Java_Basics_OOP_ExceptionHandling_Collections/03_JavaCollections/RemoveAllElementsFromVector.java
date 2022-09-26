import java.util.Vector;

public class RemoveAllElementsFromVector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();

        vector.add("c");
        vector.add("c++");
        vector.add("java");
        vector.add("python");
        vector.add("php");
        vector.add("aws");

        System.out.println("Vector Elements before remove(): ");
        for(int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        vector.clear();

        System.out.println("Vector Elements after clear(): ");
        for(int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }    
}
