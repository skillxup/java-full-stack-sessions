public class AnExampleOfConstructor {
    int age;
    String name; 

    // default constructor / no-arg constructor
    AnExampleOfConstructor() {
        // initialize or set the values to the variables of an object
        // this is a keyword which internally referring to the current running object
        this.name = "John";
        this.age = 26;
    }

    // parameteized constructor 
    AnExampleOfConstructor(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public static void main(String[] args) {
        // declaring the objects
        AnExampleOfConstructor obj1 = new AnExampleOfConstructor();
        AnExampleOfConstructor obj2 = new AnExampleOfConstructor("Steve", 23);

        // accessing the values of objects
        System.out.println(obj1.name + " " + obj1.age);
        System.out.println(obj2.name + " " + obj2.age);
    }
}
