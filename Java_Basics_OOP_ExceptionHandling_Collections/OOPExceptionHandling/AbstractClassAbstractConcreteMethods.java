// 1. Abstract class can have both Abstract and Concrete methods
abstract class Example1 {
    abstract void display1();
    public void display2() {
        System.out.println("display2 method");
    }
}

class Example2 extends Example1 {
    public void display1() {
        System.out.println("display1 method");
    }
}

public class AbstractClassAbstractConcreteMethods {
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.display1();
    }
}
