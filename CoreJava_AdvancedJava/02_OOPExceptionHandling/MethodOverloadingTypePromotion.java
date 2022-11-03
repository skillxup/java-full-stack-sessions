public class MethodOverloadingTypePromotion {
    void disp(int a, double d) {
        System.out.println("Method A");
        System.out.println("A: " + a);
        System.out.println("D: " + d);
    }

    void disp(int a, double d, double b) {
        System.out.println("Method B");
        System.out.println("A: " + a);
        System.out.println("D: " + d);
        System.out.println("B: " + b);
    }

    public static void main(String[] args) {
        MethodOverloadingTypePromotion obj1 = new MethodOverloadingTypePromotion();
        obj1.disp(100, 23.53f);
    }
}
