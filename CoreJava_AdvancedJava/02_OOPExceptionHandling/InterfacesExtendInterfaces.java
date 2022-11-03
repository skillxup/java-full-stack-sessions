// 2. Interfaces can be extended only by interfaces. Classes has to implement them. Instead of Extend.
interface Example1 {
    public void display1();
}

interface Example2 extends Example1 {

}

class Example3 implements Example2 {
    public void display1() {
        System.out.println("display1 method");
    }
}

public class InterfacesExtendInterfaces {
    public static void main(String[] args) {
        Example3 obj = new Example3();
        obj.display1();
    }
}
