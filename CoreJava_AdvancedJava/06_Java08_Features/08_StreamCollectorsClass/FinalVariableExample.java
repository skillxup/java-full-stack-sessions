class FinalVariableExample {
    final int MAX_VALUE = 99;

    void myMethod() {
        MAX_VALUE = 101;
        System.out.println("MAX_VALUE: " + MAX_VALUE);
    }

    public static void main(String[] args) {
        FinalVariableExample obj = new FinalVariableExample();
        obj.myMethod();
    }
}