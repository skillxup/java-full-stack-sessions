class CompareStringLiteralVsNewStringUsingEquals {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = new String("Hello");

        if(str.equals(str2)) {
            System.out.println("Strings str and str2 are equal");
        } else {
            System.out.println("Strings str and str2 are not equal");
        }
    } 
}
