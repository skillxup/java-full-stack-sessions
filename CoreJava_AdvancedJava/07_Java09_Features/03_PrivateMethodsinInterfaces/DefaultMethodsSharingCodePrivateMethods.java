interface MyInterfaceInJava9 {
    default void method1() {
        printLines();
        System.out.println("this is method1");
    }

    default void method2() {
        printLines();
        System.out.println("this is method2");
    }

    private void printLines() {
        System.out.println("Starting method");
        System.out.println("Doing something");
    }
}

class DefaultMethodsSharingCodePrivateMethods implements MyInterfaceInJava9 {
    public static void main(String[] args) {
        DefaultMethodsSharingCodePrivateMethods obj = new DefaultMethodsSharingCodePrivateMethods();
        obj.method1();
        obj.method2();
    }
}
