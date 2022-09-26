class SuperClass {
    SuperClass() {
        System.out.println("Constructor of Parent / Super Class");
    }
}

public class SubClassInvokeConstructor extends SuperClass {

    SubClassInvokeConstructor() {
        System.out.println("Constructor of Child Class - No Arg");
    }

    SubClassInvokeConstructor(int num) {
        System.out.println("Constructor of Child Class - Parameterized");
    }

    void display() {
        System.out.println("hello, we are at display Method at Child Class!");
    }

    public static void main(String[] args) {
        SubClassInvokeConstructor obj = new SubClassInvokeConstructor();
        obj.display();

        SubClassInvokeConstructor obj2 = new SubClassInvokeConstructor(10);
        obj2.display();
    }
}
