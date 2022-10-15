import java.util.*;
class IteratingCollectionsUsingForEachLoop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Rick");
        list.add("Negan");
        list.add("Dary");
        list.add("Glen");
        list.add("Carl");

        list.forEach((names) -> System.out.println(names));
    }
}
