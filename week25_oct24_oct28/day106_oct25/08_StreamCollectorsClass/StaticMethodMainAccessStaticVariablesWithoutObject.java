class StaticMethodMainAccessStaticVariablesWithoutObject {
    static int i = 10;
    static String s = "JavaConcepts";
    
    // this is a static method
    public static void main(String[] args) {
        System.out.println("i: " + i);
        System.out.println("s: " + s);
    }
}
