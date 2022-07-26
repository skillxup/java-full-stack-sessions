class ParentClass {
    ParentClass() {
        System.out.println("Executing the Static Polymorphism - at Parent Class Constructor");
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class StaticPolymorphism extends ParentClass {
    StaticPolymorphism() {
        System.out.println("Executing the Static Polymorphism - at Child Class Constructor");
    }

    public static void main(String[] args) {
        StaticPolymorphism obj1 = new StaticPolymorphism();
        System.out.println("add(par1, par2): " + obj1.add(10, 20));
        System.out.println("add(par1, par2, par3): " + obj1.add(10, 20, 30));
    }
}
