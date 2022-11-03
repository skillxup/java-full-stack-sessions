class DisplayOverloading {
    public void disp(char c) {
        System.out.println("char : " + c);
    }

    public void disp(char c, int n) {
        System.out.println("char : " + c);
        System.out.println("int : " + n);
    }
}

class DifferentNoParamsArgsList {
    public static void main(String[] args) {
        DisplayOverloading obj1 = new DisplayOverloading();
        obj1.disp('a');
        obj1.disp('a', 10);
    }
}
