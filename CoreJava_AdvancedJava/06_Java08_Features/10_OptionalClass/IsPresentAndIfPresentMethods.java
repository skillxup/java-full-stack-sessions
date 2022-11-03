import java.util.Optional;
class IsPresentAndIfPresentMethods {
    public static void main(String[] args) {
        // creating optional object from a string
        Optional<String> obj = Optional.of("Game of Thrones");

        // optional.empty() creates an empty optional object
        Optional<String> nothing = Optional.empty();

        if(obj.isPresent()) {
            System.out.println("Watching Game of Thrones");
        } else {
            System.out.println("I am getting Bored");
        }

        obj.ifPresent(s -> System.out.println("Watching Game of Thrones is Fun!!"));

        nothing.ifPresent(s -> System.out.println("I prefer getting Bored"));
    }
}
