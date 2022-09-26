class ExceptionOccursHandledCatchBlock {
    public static void main(String[] args) {
        try {
            System.out.println("First statement of Try Block");
            int num = 45 / 0;
            System.out.println(num); 
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } finally {
            System.out.println("Finally Block");
        }
        System.out.println("Out of Try - Catch - Finally Block");
    }
}