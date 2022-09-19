// 2. In Interface, the keyword 'abstract' is optional to declare a method as an abstract because all the methods are abstract by default
interface Example1 {
    public void display1();
}

class Example2 implements Example1 {
    public void display1() {
        System.out.println("display1 method");
    }
    public void display2() {
        System.out.println("display2 method");
    }
}

class InterfaceKeywordAbstractOptional {
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.display1();
    }
}
