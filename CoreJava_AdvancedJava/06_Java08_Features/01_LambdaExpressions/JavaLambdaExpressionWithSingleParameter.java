@FunctionalInterface
interface MyFunctionalInterface {
    // a method with single parameter
    public int incrementByFive(int a);
}

class JavaLambdaExpressionWithSingleParameter {
    public static void main(String[] args) {
        // lambda expression with single parameter num
        MyFunctionalInterface f = (num) -> num + 5;
        System.out.println(f.incrementByFive(23));
    }
}
