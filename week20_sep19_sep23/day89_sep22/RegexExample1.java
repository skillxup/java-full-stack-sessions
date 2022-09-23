import java.util.regex.*;
class RegexExample1 {
    public static void main(String[] args) {
        String content = "This is a Sample String from Regex";

        String pattern = ".*String.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("The text contains String: " + isMatch);
    }
}
