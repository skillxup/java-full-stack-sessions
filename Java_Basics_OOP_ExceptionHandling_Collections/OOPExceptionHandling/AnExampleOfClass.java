public class AnExampleOfClass {
    // fields (or instance variable)
    String webName;
    int webAge;

    // constructor 
    AnExampleOfClass(String name, int age) {
        this.webName = name;
        this.webAge = age;
    }

    public static void main(String[] args) {
        // creating objects
        AnExampleOfClass obj1 = new AnExampleOfClass("Java", 2);
        AnExampleOfClass obj2 = new AnExampleOfClass("Php", 4);

        // accessing the objects data through reference
        System.out.println(obj1.webName + " " + obj1.webAge);
        System.out.println(obj2.webName + " " + obj2.webAge);
    }
}
