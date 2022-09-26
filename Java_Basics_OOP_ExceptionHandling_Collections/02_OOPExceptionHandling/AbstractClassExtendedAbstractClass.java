// 1. Abstract class can be extended (inherited) by a class or an abstract class
class Example1 {
    public void display1() {
        System.out.println("display1 method");
    }
}

abstract class Example2 {
    public void display2() {
        System.out.println("display2 method");
    }
}

abstract class Example3 extends Example2 {
    abstract void display3();
}

class Example4 extends Example3 {
    public void display2() {
        System.out.println("Example4 - display2 method");
    }
    public void display3() {
        System.out.println("display3 method");
    }
}

public class AbstractClassExtendedAbstractClass {
    public static void main(String[] args) {
        Example4 obj = new Example4();
        obj.display2();
    }
}
