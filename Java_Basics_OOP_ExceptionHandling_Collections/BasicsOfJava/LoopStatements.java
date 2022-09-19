public class LoopStatements {
    public static void main(String[] args) {
        System.out.println("for loop");
        System.out.println("------------------------------");

        // for loop
        for(int i = 10; i > 1; i--) {
            System.out.println("the value of i is: " + i);
        }

        System.out.println("------------------------------");
        // infinite for loop
        // for(int i = 1; i >= 1; i++) {
        //     System.out.println("the value of i is: " + i);
        // }

        // for loop with array
        int arr[] = {2, 11, 45, 9};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("------------------------------");

        // enchanced for loop
        for(int num: arr) {
            System.out.println(num);
        }

        System.out.println("------------------------------");

        String arr1[] = {"hi", "hello", "bye"};
        for(String str: arr1) {
            System.out.println(str);
        }

        System.out.println("while loop");
        System.out.println("------------------------------");

        int i = 10;
        while(i > 1) {
            System.out.println(i);
            i--;
        }

        System.out.println("------------------------------");

        // iterating an array using while loop
        int arr2[] = {12, 43, 23, 18};
        i = 0;
        while(i < 4) {
            System.out.println(arr2[i]);
            i++;
        }

        System.out.println("------------------------------");
        System.out.println("do while");

        i = 0;
        do {
            System.out.println(i);
            i--;
        } while(i > 1);

        System.out.println("------------------------------");

        // array with do while
        int arr3[] = {4, 6, 2, 7};
        i = 0;
        do {
            System.out.println(arr3[i]);
            i++;
        } while(i < 4);

    }
}
