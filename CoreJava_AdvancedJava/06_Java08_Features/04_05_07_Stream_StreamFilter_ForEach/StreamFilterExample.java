import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamFilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Melisandre", "Sansa", "Jon", "Daenerys", "Joffery");

        // creating the stream of all names
        Stream<String> allNames = names.stream();

        // creating another stream by filtering long names using filter()
        Stream<String> longNames = allNames.filter(str -> str.length() > 6);

        // displaying the longNames
        longNames.forEach(str -> System.out.println(str + " "));
    }
}
