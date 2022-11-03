@FunctionalInterface
interface MyInterface {
    Hello display(String say);
}

class Hello {
    public Hello(String say) {
        System.out.println(say);
    }
}

class MethodReferenceConstructor {
    public static void main(String[] args) {
        MyInterface ref = Hello::new;
        ref.display("Hello World");
    }
}
