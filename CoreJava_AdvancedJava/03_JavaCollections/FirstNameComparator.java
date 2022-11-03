import java.util.*;
public class FirstNameComparator implements Comparator<Authorcpt> {
    public int compare(Authorcpt a1, Authorcpt a2) {
        return a1.firstName.compareTo(a2.firstName);
    }
}
