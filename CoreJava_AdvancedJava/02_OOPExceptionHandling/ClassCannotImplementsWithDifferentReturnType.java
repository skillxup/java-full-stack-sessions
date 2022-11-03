// a class cannot implement two interfaces that have methods with same but different return type

interface A {
    public void aaa();
}

interface B {
    public int aaa();
}

class Central implements A, B {
    public void aaa() {
        // code goes here
    }

    public int aaa() {
        // code goes here
    }
    public static void main(String[] args) {
        // set of statements
    }
}