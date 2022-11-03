import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class FilterNullValuesFromStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Stream", null, "Filter", null);
        List<String> result = list.stream()
            .filter(str -> str != null)
            .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
