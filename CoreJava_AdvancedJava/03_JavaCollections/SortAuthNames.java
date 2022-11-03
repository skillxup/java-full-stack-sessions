import java.util.ArrayList;
import java.util.Collections;

public class SortAuthNames {
    public static void main(String[] args) {
        // list of objects of author class
        ArrayList<Author> al = new ArrayList<Author>();
        al.add(new Author("henry", "miller", "tropic of cancer"));
        al.add(new Author("nalo", "kinson", "sky kids"));
        al.add(new Author("frank", "miller", "ice and fire"));
        al.add(new Author("george", "martin", "brown rabbit"));

        /**
         * sorting the list using Collections.sort()method, 
         * we can use this method because we have implemented the Comparable Interface in our defined class Author
         */

         Collections.sort(al);
         for(Author str: al) {
            System.out.println("Full Name: " + str.firstName + " " + str.lastName + " " + "Book Name: " + str.bookName);
         }
    }    
}
