class ParentClass {
    // overriden method
    public void doAction() {
        System.out.println("Doing the Action at Parent Class");
    }
}

class MethodOverriding extends ParentClass {
    // overriding method
    public void doAction() {
        System.out.println("Doing the Action at Child Class");
    }
    public static void main(String[] args) {
        MethodOverriding obj1 = new MethodOverriding();
        obj1.doAction();
    }
}
