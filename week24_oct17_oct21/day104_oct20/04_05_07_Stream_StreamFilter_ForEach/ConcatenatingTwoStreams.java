import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class ConcatenatingTwoStreams {
    public static void main(String[] args) {
        // list 1
        List<String> alphabets = Arrays.asList("A", "B", "c");

        // list 2
        List<String> names = Arrays.asList("Sansa", "Jon", "Arya");

        // creating two streams from the two lists and concatenatig them into one
        Stream<String> opstream = Stream.concat(alphabets.stream(), names.stream());

        // displaying the elements of the concatenated stream
        opstream.forEach(str->System.out.println(str + " "));
    }    
}
