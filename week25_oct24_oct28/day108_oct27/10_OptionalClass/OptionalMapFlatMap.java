import java.util.Optional;

class OptionalMapFlatMap {
    public static void main(String[] args) {
        // creating optional object from a string
        Optional<String> obj = Optional.of("Game of Thrones");

        // optional.empty() creates an empty map optional object
        Optional<String> nothing = Optional.empty();

        System.out.println(obj.map(String::toLowerCase));
        System.out.println(nothing.map(String::toLowerCase));

        Optional<Optional<String>> anotherOptional = Optional.of(Optional.of("BreakingNews"));

        System.out.println("Value of Optional object: " + anotherOptional);

        System.out.println("Optional.map: " + anotherOptional.map(gender -> gender.map(String::toUpperCase)));

        System.out.println("Optional.flatMap: " + anotherOptional.flatMap(gender -> gender.map(String::toUpperCase)));
    }
}