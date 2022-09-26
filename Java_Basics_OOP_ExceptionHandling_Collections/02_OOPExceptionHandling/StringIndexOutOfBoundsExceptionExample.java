class StringIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            String str = "Hello World";
            System.out.println("str len: " + str.length());

            char c = str.charAt(20);
            System.out.println("C: " + c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index out of Bounds Exception");
        }
    }    
}
