// Interface can extend any number of interfaces at a time

// first interface
interface Example1 {
    public void display1();
}

// second interface
interface Example2 {
    public void display2();
}

// this interface is extending both the above interfaces
interface Example3 extends Example1, Example2 {

}

class Example4 implements Example3 {
    public void display1() {
        System.out.println("display1 method");
    }
    public void display2() {
        System.out.println("display2 method");
    }
}

class InterfaceExtendsNInterfaces {
    public static void main(String[] args) {
        Example4 obj = new Example4();
        obj.display1();

        Example4 obj2 = new Example4();
        obj2.display2();
    }
}