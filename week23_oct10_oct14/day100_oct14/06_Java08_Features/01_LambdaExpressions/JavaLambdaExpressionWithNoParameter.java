@FunctionalInterface
interface MyFunctionalInterface {
    // a method with no parameter
    public String sayHello();
}

class JavaLambdaExpressionWithNoParameter {
    public static void main(String[] args) {
        // lambda expression
        MyFunctionalInterface msg = () -> {
            return "Hello";
        };

        System.out.println(msg.sayHello());
    }
}
