// 1. In Abstract class, the keyword 'abstract' is mandatory to declare a method as an abstract
abstract class Example1 {
    public abstract void display1();
}

class Example2 extends Example1 {
    public void display1() {
        System.out.println("display1 method");
    }

    public void display2() {
        System.out.println("display2 method");
    }
}

class AbstractClassKeywordMandatory {
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.display1();
    }
}