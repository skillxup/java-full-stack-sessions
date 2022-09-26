class AnotherNestedTryBlockExample {
    public static void main(String[] args) {
        try {
            try{
                System.out.println("Inside Parent Try Block 1");
                int b = 45 / 0;
                System.out.println("b: " + b);
            } catch(ArithmeticException e1) {
                System.out.println("Exception e1: " + e1);
            }

            try {
                System.out.println("Inside Parent Try Block 2");
                int b = 45 / 0;
                System.out.println("b: " + b); 
            } catch(ArithmeticException e2) {
                System.out.println("Exception e2: " + e2);
            }
        } catch(ArithmeticException e3) {
            System.out.println("Arithmetic Exception e4: " + e3);
            System.out.println("Inside Parent Try Block with Catch");
        } catch(ArrayIndexOutOfBoundsException e4) {
            System.out.println("Array Index out of Bounds Exception e4: " + e4);
            System.out.println("Inside Parent Try Block with Catch");
        } catch(Exception e5) {
            System.out.println("Exception e5: " + e5);
            System.out.println("Inside Parent Try Block with Catch");
        }
        System.out.println("Next Statement...");
    }
}
