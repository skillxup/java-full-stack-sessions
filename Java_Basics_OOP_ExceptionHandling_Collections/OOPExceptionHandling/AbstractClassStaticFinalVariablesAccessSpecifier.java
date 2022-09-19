// 1. Abstract class can have static, final or static final variables with any access specifier
abstract class Example1 {
    private int numOne = 10;
    protected final int numTwo = 20;
    public static final int numThree = 500;

    public void display1() {
        System.out.println("NumOne: " + numOne);
    }
}

class Example2 extends Example1 {
    public void display2() {
        System.out.println("NumTwo: " + numTwo);
        System.out.println("NumThree: " + numThree);
    }
}

public class AbstractClassStaticFinalVariablesAccessSpecifier {
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.display1();
        obj.display2();
    }
}
