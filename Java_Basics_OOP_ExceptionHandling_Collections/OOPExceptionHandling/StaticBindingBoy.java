class Human {
    public static void walk() {
        System.out.println("Human Walks - at Parent Class");
    }
}

class StaticBindingBoy extends Human {
    public static void walk() {
        System.out.println("Boy Walks - at Child Class");
    }

    public static void main(String[] args) {
        Human obj1 = new StaticBindingBoy();
        obj1.walk();

        Human obj2 = new Human();
        obj2.walk();
    }
}