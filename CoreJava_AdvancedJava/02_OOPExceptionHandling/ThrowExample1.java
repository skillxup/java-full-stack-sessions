public class ThrowExample1 {
    static void checkEligibility(int stuage, int stuweight) {
        if(stuage < 12 && stuweight < 40) {
            throw new ArithmeticException("Student is not eligible for Registration");
        } else {
            System.out.println("Student Entry is Valid");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Registration Process!");
        checkEligibility(10, 30);
        System.out.println("Have a nice day...");
    }
}
