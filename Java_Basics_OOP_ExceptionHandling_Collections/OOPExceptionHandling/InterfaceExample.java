// interface example
interface MyInterface {
    // declare the methods
    public void method1();
    public void method2();
}

class InterfaceExample implements MyInterface {
    public void method1() {
        System.out.println("Implementation of Method1");
    }

    public void method2() {
        System.out.println("Implementation of Method2");
    }

    public static void main(String[] args) {
        MyInterface obj1 = new InterfaceExample();
        obj1.method1();
    }
}