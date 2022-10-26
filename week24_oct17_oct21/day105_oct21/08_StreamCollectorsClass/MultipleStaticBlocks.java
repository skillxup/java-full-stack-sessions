class MultipleStaticBlocks {
    static int num;
    static String myStr;
    
    static {
        System.out.println("Static Block1");
        num = 77;
        myStr = "Block1";
    }

    static {
        System.out.println("Static Block2");
        num = 79;
        myStr = "Block2";
    }


    public static void main(String[] args) {
        System.out.println("Value of num: " + num);
        System.out.println("Value of myStr: " + myStr);
    }
}
