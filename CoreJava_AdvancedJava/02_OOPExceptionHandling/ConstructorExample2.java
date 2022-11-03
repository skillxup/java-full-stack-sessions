public class ConstructorExample2 {
    private int var;
    
    // default constructor / no-arg constructor
    public ConstructorExample2() {
        this.var = 10;
    }

    // parameterized constructor
    public ConstructorExample2(int num) {
        this.var = num;
    }

    public int getValue() {
        return var;
    }

    public static void main(String[] args) {
        ConstructorExample2 obj1 = new ConstructorExample2();
        ConstructorExample2 obj2 = new ConstructorExample2(100);

        System.out.println("var is: " + obj1.getValue());
        System.out.println("var is: " + obj2.getValue());
    }
}
