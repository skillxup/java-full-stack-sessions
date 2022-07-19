public class Operators {
    public static void main(String[] args) {
        // arithmatic operators: +, -, *, /, %
        int num1 = 100;
        int num2 = 20;

        System.out.println("num1 + num2: " + (num1 + num2));

        // assignment operators: +=, -=, *=, /=, %=
        num2 += num1;
        System.out.println("+= " + num2);

        // auto - increment and auto - decrement operators: ++, --
        num1++;
        System.out.println("++: " + num1);

        // logical operators: &&, ||, !
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 || b2: " + (b1 || b2));
        System.out.println("!(b1 && b2): " + !(b1 && b2));

        // comparison (relational) operators: ==, !=, <, >, <=, >=
        System.out.println("== :" + (num1 == num2));

        // bitwise operators: &, |, ^, ~, <<, >>
        num1 = 11; /* equal to 001011 */
        num2 = 22; /* equal to 010110 */
                   /*           11101  */

        int num3 = 11; /* equal to 00001011 */
        int num4 = 10; /* equal to 00010110 */
        int result = 0;

        // & - compares corresponding bits of num1 and num2 and generates 1 if both bits are equal, else it returns 0; in our case it is return 2; 
        // the bits 00000010 because in the binary form num1 & num2 only second last bits matching
        result = (num1 & num2);
        System.out.println("num1 & num2: " + result);

        result = (num3 & num4);
        System.out.println("num3 & num3: " + result);
    }
}
