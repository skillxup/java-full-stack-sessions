package xyzpackage;
import abcpackage.*;

class ProtectedTest extends ProtectedAddition {
    public static void main(String[] args) {
        ProtectedTest obj = new ProtectedTest();
        System.out.println(obj.addTwoNumbers(23, 32));
    }
}