import java.util.Optional;

class UsingOptionalClass {
    public static void main(String[] args) {
        String[] str = new String[10];
        Optional<String> isNull = Optional.ofNullable(str[9]);

        if(isNull.isPresent()) {
            // getting the substring
            String str2 = str[9].substring(2, 5);

            // displaying substring
            System.out.println("Substring is: " + str2);
        } else {
            System.out.println("Cannot get the substring from an empty string");
        }

        str[9] = "AgraIsCool";
        Optional<String> isNull2 = Optional.ofNullable(str[9]);
        if(isNull2.isPresent()) {
            // getting the substring
            String str2 = str[9].substring(2, 5);
            
            // displaying the substring
            System.out.println("Substring is: " + str2);
        } else {
            System.out.println("Cannot get the substring from an empty string");
        }
    }    
}
