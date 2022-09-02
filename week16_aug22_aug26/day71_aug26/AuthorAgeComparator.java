import java.util.*;
class AuthorAgeComparator implements Comparator<Author> {
    public int compare(Author a1, Author a2) {
        if(a1.auAge == a2.auAge)
            return 0;
        else if(a1.auAge > a2.auAge)
            return 1;
        else
            return -1;
    }
}
