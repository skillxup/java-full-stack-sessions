@FunctionalInterface
interface MyInterface {
    void display();
}
class MethodReferenceInstanceMethodObject {
    public void myMethod() {
        System.out.println("Instance Method");
    }
    public static void main(String[] args) {
        MethodReferenceInstanceMethodObject obj = new MethodReferenceInstanceMethodObject();

        // method reference using the object of the class
        MyInterface ref = obj::myMethod;
        ref.display();
    }
}
