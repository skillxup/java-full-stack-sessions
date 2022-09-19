import java.util.ArrayList;
class ChangeElementArrayList {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("steve");
        alist.add("tim");

        System.out.println(alist);

        alist.add("lucy");
        alist.add("angelia");

        System.out.println(alist);

        alist.set(0, "lucku");
        alist.set(3, "jackson");

        System.out.println(alist);
    }
}
