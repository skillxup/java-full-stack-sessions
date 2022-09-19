import java.util.*;
class IteratingArrayList {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("steve");
        alist.add("tim");

        System.out.println(alist);

        alist.add("lucy");
        alist.add("angelia");

        System.out.println(alist);

        for(String str: alist) {
            System.out.println(str);
        }
    }
}
