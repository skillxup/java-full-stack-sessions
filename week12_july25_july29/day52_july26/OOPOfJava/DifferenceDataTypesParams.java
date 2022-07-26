class DisplayOverloading {
    public void disp(char c) {
        System.out.println("Char: " + c);
    }

    public void disp(int n) {
        System.out.println("Int: " + n);
    }

    public void disp(boolean b) {
        System.out.println("Boolean: " + b);
    }
}

class DifferenceDataTypesParams {
    public static void main(String[] args) {
        DisplayOverloading obj1 = new DisplayOverloading();
        obj1.disp('a');
        obj1.disp(2);
        obj1.disp(true);
    }
}
