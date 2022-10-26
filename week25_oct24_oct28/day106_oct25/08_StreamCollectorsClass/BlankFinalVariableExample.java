class BlankFinalVariableExample {
    // blank final variable
    final int MAX_VALUE;
    
    BlankFinalVariableExample() {
        // it must be initialized in constructor
        MAX_VALUE = 100;
    }

    void myMethod() {
        System.out.println(MAX_VALUE);
    }

    public static void main(String[] args) {
        BlankFinalVariableExample obj = new BlankFinalVariableExample();
        obj.myMethod();
    }
}
