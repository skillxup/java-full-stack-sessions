import java.util.*;
public class SortArrayListinDescendingOrder {
    public static void main(String[] args) {
        ArrayList<String> listOfCountries = new ArrayList<String>();

        listOfCountries.add("India");
        listOfCountries.add("US");
        listOfCountries.add("China");
        listOfCountries.add("Denmark");

        System.out.println("Original ArrayList: ");
        for(String str: listOfCountries) {
            System.out.println(str);
        }

        Collections.sort(listOfCountries, Collections.reverseOrder());

        System.out.println("Sorted ArrayList: ");
        for(String str: listOfCountries) {
            System.out.println(str);
        }
    }
}
