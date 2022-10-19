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

    void disp(String str);
}

class MultipleInheritanceExample implements MyInterface, MyInterface2 {
    // implementing abstract methods
    public void existingMethod(String str) {
        System.out.println("String is: " + str);
    }

    public void disp(String str) {
        System.out.println("String is: " + str);
    }

    public static void main(String[] args) {
        MultipleInheritanceExample obj = new MultipleInheritanceExample();

        obj.newMethod();
    }
}