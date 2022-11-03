class DisplayingFirstAndLastCharacterOfAString {
    public static void main(String[] args) {
        String str = "Welcome to Java Concepts";

        // finding the length of a string
        int len = str.length();

        // first character of the string
        System.out.println("First Character: " + str.charAt(0));

        // last character
        System.out.println("Last Character: " + str.charAt(len-1));
    }    
}
