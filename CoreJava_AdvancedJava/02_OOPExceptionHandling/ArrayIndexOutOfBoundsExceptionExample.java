class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            int a[] = new int[10];
            a[11] = 46;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception");
        }
    }
}
