import java.util.ArrayList;
import java.util.Collections;

public class SortingPgm {
    public static void main(String[] args) {
        ArrayList<Authorcpt> al = new ArrayList<Authorcpt>();
        
        al.add(new Authorcpt("henry", "tropic of cancer", 45));
        al.add(new Authorcpt("nalo", "brown girl", 56));
        al.add(new Authorcpt("frank", "in the ring", 65));
        al.add(new Authorcpt("beborah", "sky boys", 51));
        al.add(new Authorcpt("george", "a song of ice and fire", 67));

        // sorting the list using Collections.sort() method
        // we can use this method because we have implemented the 
        // Comparable Interface in our defined class Author
        
        System.out.println("Sorting by Author First Name");
        Collections.sort(al, new FirstNameComparator());
        for(Authorcpt au: al) {
            System.out.println("First Name: " + au.getFirstName() + ", Book Name: " + au.getBookName() + ", Age: " + au.getAuAge());
        }
        System.out.println("-------------------------------------");
        
        // Sorting using AuthorAgeComparator
        System.out.println("Sorting by Author Age");
        Collections.sort(al, new AuthorAgeComparator());
        for(Authorcpt au: al) {
            System.out.println("First Name: " + au.getFirstName() + ", Book Name: " + au.getBookName() + ", Age: " + au.getAuAge());
        }

        System.out.println("-------------------------------------");

        // Sorting using BookNameComparator
        System.out.println("Sorting by Book Name");
        Collections.sort(al, new BookNameComparator());
        for(Authorcpt au: al) {
            System.out.println("First Name: " + au.getFirstName() + ", Book Name: " + au.getBookName() + ", Age: " + au.getAuAge());
        }
    }    
}
