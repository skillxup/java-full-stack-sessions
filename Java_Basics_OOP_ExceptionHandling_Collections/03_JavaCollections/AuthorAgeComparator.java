import java.util.*;
class AuthorAgeComparator implements Comparator<Authorcpt> {
    public int compare(Authorcpt a1, Authorcpt a2) {
        if(a1.auAge == a2.auAge)
            return 0;
        else if(a1.auAge > a2.auAge)
            return 1;
        else
            return -1;
    }
}
