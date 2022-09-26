public class Operators {
    public static void main(String[] args) {
        // arithmatic operators: +, -, *, /, %
        int num1 = 100;
        int num2 = 20;

        int res = 0;
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
        
        // & - compares corresponding bits of num1 and num2 and generates 1 if both bits are equal, else it returns 0; 

        // | - compares corresponding bits of num1 and num2 and generates 1 if either of any bit is 1, else it returns 0; 

        // ^ - compares corresponding bits of num1 and num2 and generates 1 if they are not equal, else it returns 0;

        // ~num1 - is a complement operator that just changes the bit from 0 to 1 and 1 to 0 

        // num1 << 2 - is left shift operator that moves the bits to the left, discards the farleft bit, and assigns bit a value of 0.

        // num1 >> 2 - is right shift operator that moves the bits to the right, discards the far right bit and assigns the leftmost bit a value of 0
        num1 = 10; // 1010 - ~0101
        num2 = 11; // 1011 - ~0100
        
        res = (num1 & num2);
        System.out.println("num1 & num2: " + res);

        res = (num1 | num2);
        System.out.println("num1 | num2: " + res);

        res = (num1 ^ num2);
        System.out.println("num1 ^ num2: " + res);

        res = ~num1;
        System.out.println("~num1:  " + res);

        res = ~num2;
        System.out.println("~num2:  " + res);
        
        res = (num1 << 2);
        System.out.println("num1 << 2: " + res);

        res = (num1 >> 2);
        System.out.println("num1 >> 2: " + res);

        // ternary operators: () ? : 
        num1 = 25;
        num2 = (num1 == 10) ? 100 : 200;
        System.out.println("num2: " + num2);
    }
}
