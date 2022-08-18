class TryBlockReturnFinallyExample {
    public static void main(String[] args) {
        System.out.println("Giving a call to myMethod: " + TryBlockReturnFinallyExample.myMethod());
    }

    public static int myMethod() {
        try {
            return 15;
        } finally {
            System.out.println("This is Finally Block");
            System.out.print("Finally Block ran even after Return statement executes at Try Block");
        }
    }
}
