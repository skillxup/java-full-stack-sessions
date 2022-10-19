import java.util.function.IntBinaryOperator;

class UsingPreDefinedFunctionalInterface {
    public static void main(String[] args) {
        // lambda expression
        IntBinaryOperator sum = (a, b) -> a + b;
        System.out.println("Result: " + sum.applyAsInt(43, 23));
    }
}
