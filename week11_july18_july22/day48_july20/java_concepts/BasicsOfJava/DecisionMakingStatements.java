public class DecisionMakingStatements {
    public static void main(String[] args) {
        int num = 70;

        // if statement
        if(num < 100) {
            System.out.println("number is less than 100");
        }

        System.out.println("------------------------------");

        // nested if statement
        if(num < 100) {
            System.out.println("number is less than 100");
            if(num > 50) {
                System.out.println("number is greater than 50");
            }
        }

        System.out.println("------------------------------");

        // if else statement
        if(num < 50) {
            System.out.println("number is less than 50");
        } else {
            System.out.println("number is either equal to 50 or greater than 50");
        }

        System.out.println("------------------------------");

        // if else if statement
        num = 1234;

        if(num < 100 && num >= 1) {
            System.out.println("Its a two digit number");
        } else if(num < 1000 && num >= 100) {
            System.out.println("Its a three digit number");
        } else if(num < 10000 && num >= 1000) {
            System.out.println("Its a four digit number");
        } else if(num < 100000 && num >= 10000) {
            System.out.println("Its a five digit number");
        } else {
            System.out.println("number is not between 1 & 99999");
        }

        System.out.println("------------------------------");

        // switch case statement
        num = 2;
        switch(num + 1) {
            case 1: 
                System.out.println("case1: value is: " + (num + 0));
                break;
            case 2: 
                System.out.println("case2: value is: " + (num + 1));
                break;
            case 3: 
                System.out.println("case3: value is: " + (num + 1));
                break;
            default: 
                System.out.println("default: value is: " + num);
        }

        System.out.println("------------------------------");

        char ch = 'b';
        switch(ch) {
            case 'd': 
                System.out.println("case1: " + ch);
                break;
            case 'b': 
                System.out.println("case2: " + ch);
                break;
            case 'e': 
                System.out.println("case3: " + ch);
                break;
            case 'g': 
                System.out.println("case4: " + ch);
                break;
            default: 
                System.out.println("none of the case is matching");
        }

        // valid expresions for switch
        // switch(1 + 2 + 25)
        // switch(1 * 3 + 4 / 4)

        // invalid expressions for switch
        // switch(ab + cd)
        // switch(a + b + c)
    }
}
