package xyzpackage;

// we are importing the abcpackage but still we get error because of the class we are trying to use has default access modifier
import abcpackage.*;

public class Test {
    public static void main(String[] args) {
        Addition obj = new Addition();
        /**
         * it will throw the error because we are trying to access the default method in another package
         */
        obj.addTwoNumbers(23, 75);
    }
}