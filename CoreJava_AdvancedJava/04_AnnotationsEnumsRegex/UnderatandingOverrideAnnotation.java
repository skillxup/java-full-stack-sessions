class MyParentClass {
    public void justaMethod() {
        System.out.println("Parent class method");
    }
}
public class MyChildClass extends MyParentClass {
    @Override
    public void justaMethod() {
        System.out.println("Child class method");
    }
}
