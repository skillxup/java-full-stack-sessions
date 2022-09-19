import java.util.*;
public class AnonymousInnerClassMethodInitialize {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(){{
            add("delhi");
            add("agra");
            add("chennai");
            add("pune");
            add("noida");
        }};
        System.out.println("Content of Array List Cities: " + cities);
    }
}
