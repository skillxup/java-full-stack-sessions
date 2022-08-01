abstract class AbstractClassDemo {
    public void myMethod() {
        System.out.println("Hello, its myMethod executing!");
    }

    abstract public void anotherMethod();
}

public class ObjectCreationNotAllowedAbstract extends AbstractClassDemo {
    public void anotherMethod() {
        System.out.println("anotherMethod is executing in Child Class!");
    }
    public static void main(String[] args) {
        AbstractClassDemo obj1 = new AbstractClassDemo();
        obj1.anotherMethod();
    }
}