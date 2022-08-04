// 2. Interface can have only public abstract methods
interface Example1 {
    void display1();
}

class Example2 implements Example1 {
    public void display1() {
        System.out.println("display1 method");
    }

    public void display2() {
        System.out.println("display2 method");
    }
}

public class InterfaceOnlyPublicAbstractMethods {
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.display1();
    }
}
