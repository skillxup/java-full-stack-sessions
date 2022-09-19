class InvalidProductException extends Exception {
    public InvalidProductException(String s) {
        // call constructor of parent exception
        super(s);
    }
}

class UserDefinedExceptionExample2 {
    void productCheck(int weight) throws InvalidProductException {
        if(weight < 100) {
            throw new InvalidProductException("Product Invalid");
        }
    }
    public static void main(String[] args) {
        UserDefinedExceptionExample2 obj = new UserDefinedExceptionExample2();
        try {
            obj.productCheck(60);
        } catch(InvalidProductException ex) {
            System.out.println("Caught the Exception");
            System.out.println(ex.getMessage());
        }
    }
}
