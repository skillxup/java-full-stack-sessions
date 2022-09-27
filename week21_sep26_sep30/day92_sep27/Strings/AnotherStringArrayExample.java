class AnotherStringArrayExample {
    public static void main(String[] args) {
        String str = "JavaDoc";

        // declaring a char array
        char arrCh[] = {'h', 'e', 'l', 'l', 'o'};

        // converting char array arrCh[] to string str2
        String str2 = new String(arrCh);

        // creating another java string str3 by using new keyword
        String str3 = new String("Java String Example");

        // displaying the strings
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    } 
}
