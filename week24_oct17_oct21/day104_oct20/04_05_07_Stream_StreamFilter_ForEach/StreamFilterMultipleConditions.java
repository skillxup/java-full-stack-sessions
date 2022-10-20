import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StreamFilterMultipleConditions {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Melisandre", "Sansa", "Jon", "Daenerys", "Joffery");

        List<String> longNames = names.stream()
            .filter(str -> str.length() > 6 && str.length() < 8)
            .collect(Collectors.toList());

        longNames.forEach(System.out::println);
    }
}
