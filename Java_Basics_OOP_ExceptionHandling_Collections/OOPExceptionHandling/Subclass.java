// parent class or super class or base class
class Superclass {
    int num = 100;
}

// child class or sub class or derived class
class Subclass extends Superclass {
    int num = 110;

    void printNumber() {
        System.out.println(super.num);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.printNumber();
    }
}