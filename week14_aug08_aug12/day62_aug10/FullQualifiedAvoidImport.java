// declaring a package
// package anotherpackage;
public class FullQualifiedAvoidImport {
    public static void main(String[] args) {
        // using fully qualified name instead of import
        letmecalculate.PackageCalculator obj = new letmecalculate.PackageCalculator();
        System.out.println(obj.add(11, 22));
    }
}
