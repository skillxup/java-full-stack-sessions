import java.util.Optional;

class OptionalWithFilter {
    public static void main(String[] args) {
        Optional<String> obj = Optional.of("Game of Thrones");
        System.out.println(obj.filter(s -> s.equals("GAME OF THRONES")));
        System.out.println(obj.filter(s -> s.equalsIgnoreCase("GAME OF THRONES")));
    }    
}
