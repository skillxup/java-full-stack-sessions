import java.util.*;
class RemoveElementArrayList {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("steve");
        alist.add("tim");

        System.out.println(alist);

        alist.add("lucy");
        alist.add("angelia");

        System.out.println(alist);

        alist.remove("tim");

        System.out.println(alist);

        alist.remove("john");

        System.out.println(alist);

        alist.remove(2);

        System.out.println(alist);
    }    
}
