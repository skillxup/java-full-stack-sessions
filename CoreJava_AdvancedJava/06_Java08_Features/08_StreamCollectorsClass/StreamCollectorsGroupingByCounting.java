import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class StreamCollectorsGroupingByCounting {
    public static void main(String[] args) {
        List<String> names = 
            Arrays.asList("John", "Ajeet", "Steve", "Ajeet", "Jon", "Ajeet");

        Map<String, Long> map = 
            names.stream().collect(
                Collectors.groupingBy(
                    Function.identity(), 
                    Collectors.counting()
                )
            );

        System.out.println(map);
    }
}
