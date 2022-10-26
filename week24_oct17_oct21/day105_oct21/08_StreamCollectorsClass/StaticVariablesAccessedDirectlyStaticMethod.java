class StaticVariablesAccessedDirectlyStaticMethod {
    static int var1;
    static String var2;
    
    // this is a static method
    static void disp() {
        System.out.println("Var1 is: " + var1);
        System.out.println("Var2 is: " + var2);
    }

    public static void main(String[] args) {
        disp();
    }
}
