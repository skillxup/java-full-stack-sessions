class NestedTryCatchBlockExample {
    public static void main(String[] args) {
        try {
            // statements
            try {
                // statements
                try {
                    int arr[] = {1, 2, 3, 4};
                    System.out.println("arr[10]:" + arr[10]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array Index out of Bounds Exception");
                }
            } catch (Exception e) {
                System.out.println("Generic Exception");
            }
        } catch (Exception e) {
            System.out.println("Generic Exception");
        }
    }    
}
