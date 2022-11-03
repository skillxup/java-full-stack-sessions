abstract class MyClass<T> {
    abstract T add(T num, T num2);
}

class ProblemDiamondAnonymousInnerClass {
    public static void main(String[] args) {
        MyClass<Integer> obj = new MyClass<>() {
            Integer add(Integer x, Integer y) {
                return x + y;
            }
        };

        Integer sum = obj.add(1, 7);
        System.out.println(sum);
    }
}