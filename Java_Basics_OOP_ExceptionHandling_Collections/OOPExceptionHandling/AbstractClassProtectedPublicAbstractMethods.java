// 1. Abstract class can have protected and public abstract methods
abstract class Example1 {
    protected abstract void display1();
    public abstract void display2();
    public abstract void display3();
}

class Example2 extends Example1 {
    public void display1() {
        System.out.println("display1 method");
    }

    public void display2() {
        System.out.println("display2 method");
    }

    public void display3() {
        System.out.println("display3 method");
    }
}

public class AbstractClassProtectedPublicAbstractMethods {
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.display1();
    }
}
