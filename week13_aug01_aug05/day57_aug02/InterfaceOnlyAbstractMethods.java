// 2. Interface can only have abstract methods, they cannot have concrete methods
interface Example1 {
    public abstract void display1();
}

class Example2 implements Example1 {
    public void display1() {
        System.out.println("display1 method");
    }
}

public class InterfaceOnlyAbstractMethods {
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.display1();
    }
}
