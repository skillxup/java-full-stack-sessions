interface MyInterface {
    default void newMethod() {
        System.out.println("Newly added default method");
    }

    void existingMethod(String str);
}

class DefaultMethodInInterface implements MyInterface {
    public void existingMethod(String str) {
        System.out.println("String is: " + str);
    }

    public static void main(String[] args) {
        DefaultMethodInInterface obj = new DefaultMethodInInterface();
        
        // calling the default method of interface
        obj.newMethod();

        // calling the abstract method of interface
        obj.existingMethod("This is an existing method!");
    }
}