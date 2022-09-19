class UserDefinedException extends Exception {
    String str1;
    UserDefinedException(String str2) {
        str1 = str2;
    }

    public String toString() {
        return "User Defined Exception: " + str1;
    }
}

class UserDefinedExceptionExample1 {
    public static void main(String[] args) {
        try {
            System.out.println("Starting of the Try Block");
            throw new UserDefinedException("This is Custom Error Exception");
        } catch(UserDefinedException exp) {
            System.out.println("Catch Block");
            System.out.println(exp);
        }
    }
}
