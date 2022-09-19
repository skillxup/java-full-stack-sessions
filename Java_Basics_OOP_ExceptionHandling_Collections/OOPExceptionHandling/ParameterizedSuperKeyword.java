class ParentClass {
    ParentClass() {
        System.out.println("Parent Class Constructor - No Arg");
    }

    ParentClass(String str) {
        System.out.println("Parent Class Constructor - with Arg: " + str);
    }
}

public class ParameterizedSuperKeyword extends ParentClass {
    ParameterizedSuperKeyword() {
        // it is giving a call to parent class with args
        super("message for obj2 - parent class");
        System.out.println("Child Class Constructor - No Arg");
    }

    ParameterizedSuperKeyword(String str) {
        System.out.println("Child Class Constructor - Parameterized: " + str);
    }

    void display() {
        System.out.println("Display Method at Child Class");
    }

    public static void main(String[] args) {
        ParameterizedSuperKeyword obj1 = new ParameterizedSuperKeyword();
        obj1.display();

        System.out.println("------------------------------------------");
        
        ParameterizedSuperKeyword obj2 = new ParameterizedSuperKeyword("message for obj2 - child class");
        obj2.display();
    }
}
