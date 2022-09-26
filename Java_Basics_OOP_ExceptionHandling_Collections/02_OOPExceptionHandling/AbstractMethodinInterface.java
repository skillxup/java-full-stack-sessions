// 2: abstract method in interface
// interface
interface Multiply {
    // abstract methods
    public abstract int multipleTwo(int n1, int n2);
    
    // we need not mention public and abstract in interface as all the methods in interface are public and abstract by default so the compiler will treate this as public abstract multipleThree()

    int multipleThree(int n1, int n2, int n3);
    
    // regular (or concrete) methods are not allowed in an interface so if we write the regular (or concrete) methods - will get a compilation error
    // public void disp() {
    //     System.out.println("this will be a compilation error");
    // }
}

class AbstractMethodinInterface implements Multiply {
    public int multipleTwo(int num1, int num2) {
        return num1 * num2;
    }

    public int multipleThree(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public static void main(String[] args) {
        Multiply obj = new AbstractMethodinInterface();
        System.out.println(obj.multipleTwo(2, 5));
        System.out.println(obj.multipleThree(4, 7, 3));
    }
}
