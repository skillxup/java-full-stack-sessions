class StringLiteralvsNewString {
    public static void main(String[] args) {
        // creating a string using string literal
        String s1 = "JavaDoc";
        String s2 = "JavaDoc";

        // creating strings using new keyword
        String s3 = new String("JavaDoc");
        String s4 = new String("JavaDoc");

        if(s1 == s2) {
            System.out.println("String s1 and s2 are equal");
        } else {
            System.out.println("String s1 and s2 are not equal");
        }

        if(s3 == s4) {
            System.out.println("String s3 and s4 are equal");
        } else {
            System.out.println("String s3 and s4 are not equal");
        }
    }
}