class DisplayOverloading {
    public void disp(char c, int n) {
        System.out.println("Char : " + c + ", Int: " + n);
    }

    public void disp(int n, char c) {
        System.out.println("Int : " + n + ", Char: " + c);
    }
}

class SequenceDataTypesArgs {
    public static void main(String[] args) {
        DisplayOverloading obj1 = new DisplayOverloading();
        obj1.disp('x', 4);
        obj1.disp(6, 'y');    
    }
}
