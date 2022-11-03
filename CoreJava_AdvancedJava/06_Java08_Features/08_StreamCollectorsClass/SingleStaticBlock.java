class SingleStaticBlock {
    static int num;
    static String myStr;
    
    static {
        num = 35;
        myStr = "static keyword in java";
    }    

    public static void main(String[] args) {
        System.out.println("Value of num: " + num);
        System.out.println("Value of myStr: " + myStr);
    }
}
