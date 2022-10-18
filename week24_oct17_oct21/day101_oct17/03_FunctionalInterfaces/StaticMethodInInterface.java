interface MyInterface {
    default void newMethod() {
        System.out.println("Newly added default method");
    }

    static void anotherNewMethod() {
        System.out.println("Newly added static method");    
    }

    void existingMethod(String str);
}

class StaticMethodInInterface implements MyInterface {
    public void existingMethod(String str) {
        System.out.println("String is: " + str);
    }
    
    public static void main(String[] args) {
        StaticMethodInInterface obj = new StaticMethodInInterface();

        // calling the default method of interface
        obj.newMethod();

        // calling the static method of interface
        MyInterface.anotherNewMethod();

        // calling the abstract method of interface
        obj.existingMethod("Static method in Interface!");
    }
}
