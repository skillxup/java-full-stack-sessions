class Human {
    public void walk() {
        System.out.println("DynamicBindingDemo executes - Parent Class");
    }
}

class DynamicBindingDemo extends Human {
    public void walk() {
        System.out.println("DynamicBindingDemo executes - Child Class");
    }
    public static void main(String[] args) {
        Human obj1 = new DynamicBindingDemo();
        obj1.walk();

        Human obj2 = new Human();
        obj2.walk();
    }
}
