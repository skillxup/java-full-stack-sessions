abstract class MyClass<T> {
    abstract T add(T num, T num2);
}

class DiamondOperatorEnhancements {
    public static void main(String[] args) {
        MyClass<Integer> obj = new MyClass<>() {
            Integer add(Integer x, Integer y) {
                return x + y;
            }
        };

        Integer sum = obj.add(1, 4);
        System.out.println(sum);
    }
}
