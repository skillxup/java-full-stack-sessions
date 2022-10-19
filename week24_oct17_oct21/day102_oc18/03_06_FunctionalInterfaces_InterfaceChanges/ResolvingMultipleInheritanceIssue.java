interface MyInterface {
    default void newMethod() {
        System.out.println("Newly added default method - MyInterface");
    }

    void existingMethod(String str);
}

interface MyInterface2 {
    default void newMethod() {
        System.out.println("Newly added default method - MyInterface2");
    }
}

class ResolvingMultipleInheritanceIssue implements MyInterface, MyInterface2 {
    // implementing abstract methods
    public void existingMethod(String str) {
        System.out.println("String is: " + str);
    }

    public void disp(String str) {
        System.out.println("String is: " + str);
    }

    public void newMethod() {
        System.out.println("Implementation of default method");
    }

    public static void main(String[] args) {
        ResolvingMultipleInheritanceIssue obj = new ResolvingMultipleInheritanceIssue();

        obj.newMethod();
    }
}
