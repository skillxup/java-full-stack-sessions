import java.util.Optional;

class OrElseandOrElseGetMethods {
    public static void main(String[] args) {
        // creating optional object from a string
        Optional<String> obj = Optional.of("Game of Thrones");

        // Optional.empty() creates an empty Optional object
        Optional<String> nothing = Optional.empty();

        // orElse() method
        System.out.println(obj.orElse("Default Value"));
        System.out.println(nothing.orElse("Default Value"));

        // orElseGet() method
        System.out.println(obj.orElseGet(() -> "Default Value"));
        System.out.println(nothing.orElseGet(() -> "Default Value"));
    }    
}
