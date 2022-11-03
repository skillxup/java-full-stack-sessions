class NumberFormatExecptionExample {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception occured");
        }
    }
}
