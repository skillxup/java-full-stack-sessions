class ParentClass {
    // overriden method
    void display() {
        System.out.println("Parent Class 'display' Method executed!");
    }
}

class SuperKeywordMethodOverriding extends ParentClass {
    // overriding method
    void display() {
        System.out.println("Child Class 'display' Method executed!");
    }

    void printMsg() {
        System.out.println("Child Class 'printMsg' is executed!");
        //  this would call overriding method
        display();
        // this would call overriden method
        super.display();
    }
    public static void main(String[] args) {
        SuperKeywordMethodOverriding obj1 = new SuperKeywordMethodOverriding();
        obj1.printMsg();
    }
}