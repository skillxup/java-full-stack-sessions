interface MyInterfaceInJava8 {
    default void method1() {
        System.out.println("Starting method1");
        System.out.println("Doing something");
        System.out.println("This is method1");
    }

    default void method2() {
        System.out.println("Starting method2");
        System.out.println("Doing something");
        System.out.println("This is method2");
    }
}

class MultipleDefaultMethodsWithDuplicateCode implements MyInterfaceInJava8 {
    public static void main(String[] args) {
        MultipleDefaultMethodsWithDuplicateCode obj = new MultipleDefaultMethodsWithDuplicateCode();
        obj.method1();
        obj.method2();
    }
}