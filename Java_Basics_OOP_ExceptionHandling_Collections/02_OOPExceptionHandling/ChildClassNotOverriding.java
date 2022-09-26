class ParentClass {
    void display() {
        System.out.println("Parent Class - display() Method executed!");
    }
}

public class ChildClassNotOverriding extends ParentClass {
    void printMsg() {
        display();
    }
    public static void main(String[] args) {
        ChildClassNotOverriding obj1 = new ChildClassNotOverriding();
        obj1.printMsg();
    }
}
