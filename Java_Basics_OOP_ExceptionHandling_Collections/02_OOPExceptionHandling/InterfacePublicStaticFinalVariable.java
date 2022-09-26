// 2. Interface can have only public static final (constant) variable
interface Example1 {
    int numOne = 10;
}

class Example2 implements Example1 {
    public void display1() {
        System.out.println("NumOne: " + numOne);
    }
}

public class InterfacePublicStaticFinalVariable {
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.display1();
    }
}
