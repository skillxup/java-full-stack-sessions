import java.util.ArrayList;
import java.util.List;

class FindingCertainStringsUsingStreams {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Ajeet");
        names.add("Negan");
        names.add("Aditya");
        names.add("Steve");

        // using stream and lambda expression
        long count = names.stream().filter(str -> str.length() < 6).count();
        System.out.println("There are " + count + " strings with less than 6 characters");
    }
}
