class FinallyBlockWithExceptionOccursTryBlock {
    public static void main(String[] args) {
        try {
            System.out.println("First Statement of Try Block");
            int num = 23 / 0;
            System.out.println("num: " + num);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index out of Bounds Exception");
        } finally {
            System.out.println("Finally Block");
        }
        System.out.println("Out of Try Catch Finally Block");
    }    
}
