class ReverseAString {
    public static void main(String[] args) {
        String str = "Welcome to Iamrk";
        String reversed = reverseString(str);
        System.out.println("The reversed String is: " + reversed);
    }    

    public static String reverseString(String str) {
        if(str.isEmpty())
            return str;
        return reverseString(str.substring(1) + str.charAt(0));
    }
}
