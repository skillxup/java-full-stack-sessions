class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int num = 121 / 0;
            System.out.println("num: " + num);
        } catch(Exception e) {
            System.out.println("Number should not be divided by zero");
        } finally {
            System.out.println("This is Finally Block");
        }
        System.out.println("Out of Try Catch Block");
    } 
}
