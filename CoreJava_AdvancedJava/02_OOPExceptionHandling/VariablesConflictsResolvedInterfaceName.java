// variable names conflicts can be resolved by interface name
interface A {
    int x = 10;
}

interface B {
    int x = 100;
}

class VariablesConflictsResolvedInterfaceName implements A, B {
    public static void main(String[] args) {
        // System.out.println("X: " + x);
        System.out.println("A.X: " + A.x);
        System.out.println("B.X: " + B.x);
    }
}