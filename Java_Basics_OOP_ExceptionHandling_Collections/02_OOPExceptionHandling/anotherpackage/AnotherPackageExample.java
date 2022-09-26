// declaring the package
package anotherpackage;

// importing a package
import letmecalculate.*;
public class AnotherPackageExample {
    public static void main(String[] args) {
        PackageCalculator obj = new PackageCalculator();
        System.out.println(obj.add(3, 8));
    }
}
