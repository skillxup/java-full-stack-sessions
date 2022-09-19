package anotherpackage;

public class PackageCalculator {
    public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        PackageCalculator obj = new PackageCalculator();
        System.out.println(obj.add(2, 8));
    }
}
