// if there are two or more same methods in two interfaces and a class implements both interfaces, implementation of the method once is enough

interface A {
    public void aaa();
}

interface B {
    public void aaa();
}

class Central implements A, B {
    public void aaa() {
        // code goes here
    }
    public static void main(String args[]) {
        // set of statements
    }
}