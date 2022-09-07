import java.util.Vector;

public class ConvertVectorToStringArray {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();

        vector.add("tim");
        vector.add("rock");
        vector.add("hulk");
        vector.add("rick");
        vector.add("james");

        System.out.println("Vector Elements: ");
        for(String str: vector) {
            System.out.println(str);
        }

        String[] array = vector.toArray(new String[vector.size()]);
        System.out.println("String Array Elements: ");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }    
}
