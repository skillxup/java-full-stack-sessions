import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class FilterNullValuesAfterMapIntermediateOperation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, null, 4, null, 5);
        List<Integer> result = list.stream()
            .map(num -> num)
            .filter(n -> n != null)
            .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
