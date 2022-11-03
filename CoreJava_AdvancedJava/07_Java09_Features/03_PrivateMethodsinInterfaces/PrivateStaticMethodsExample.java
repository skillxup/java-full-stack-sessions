interface MyInterfaceInJava9 {
    static void method1() {
        printLines();
        System.out.println("this is method1");
    }

    static void method2() {
        printLines();
        System.out.println("this is method2");
    }

    private static void printLines() {
        System.out.println("Starting method");
        System.out.println("Doing something");
    }

    default void mymethods() {
        method1();
        method2();
    }
}

class PrivateStaticMethodsExample implements MyInterfaceInJava9 {
    public static void main(String[] args) {
        PrivateStaticMethodsExample obj = new PrivateStaticMethodsExample();
        obj.mymethods();
    }
}
