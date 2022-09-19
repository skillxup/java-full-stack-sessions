class ThrowsUsageExample1 {
    public void myMethod() throws ArithmeticException, NullPointerException {
        try {
            // statements that might throw an exception
        } catch(ArithmeticException e) {
            // exception handling statements
        } catch(NullPointerException e) {
            // exeception handling statements
        }
    }

    public static void main(String[] args) {
        ThrowsUsageExample1 obj = new ThrowsUsageExample1();
        obj.myMethod();
    }    
}
