import java.util.*;
public class BookNameComparator implements Comparator<Authorcpt> {
    public int compare(Authorcpt a1, Authorcpt a2) {
        return a1.bookName.compareTo(a2.bookName);
    }
}
