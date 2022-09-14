import java.util.LinkedHashSet;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> lhset = new LinkedHashSet<String>();

        lhset.add("Z");
        lhset.add("PQ");
        lhset.add("N");
        lhset.add("KK");
        lhset.add("GFH");
        
        System.out.println(lhset);

        LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

        lhset2.add(75);
        lhset2.add(43);
        lhset2.add(53);
        lhset2.add(55);
        lhset2.add(67);

        System.out.println(lhset2);
    }    
}
