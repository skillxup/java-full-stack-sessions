class WithoutUsingOptionalClass {
    public static void main(String[] args) {
        String[] str = new String[10];
        
        // getting the substring
        String str2 = str[9].substring(2, 5);

        // displaying substring
        System.out.println(str2);
    }
}