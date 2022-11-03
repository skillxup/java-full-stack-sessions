class StaticMethodAccessDirectlyStaticNonStaticMethod {
    static int i = 100;
    static String s = "Java Concepts";
    
    static void display() {
        System.out.println("i: " + i);
        System.out.println("s: " + s);
    }

    // non-static method
    void func() {
        //static method called in non-static method
        display();
    }

    // static method
    public static void main(String[] args) {
        StaticMethodAccessDirectlyStaticNonStaticMethod obj = new StaticMethodAccessDirectlyStaticNonStaticMethod();
        // you need to have object to call this non-static method
        obj.func();

        // static method called in another static method
        display();
    }
}
