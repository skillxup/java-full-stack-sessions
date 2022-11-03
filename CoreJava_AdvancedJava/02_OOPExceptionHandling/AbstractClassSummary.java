abstract class MyAbstractClass {
    public void disp() {
        System.out.println("Concrete Method at Parent Class");
    }

    abstract public void disp2();
}

class AbstractClassSummary extends MyAbstractClass {
    public void disp2() {
        System.out.println("disp() method at Child Class - Overriding Abstract Method");
    }
    public static void main(String[] args) {
        AbstractClassSummary obj1 = new AbstractClassSummary();
        obj1.disp2();
    }
}
