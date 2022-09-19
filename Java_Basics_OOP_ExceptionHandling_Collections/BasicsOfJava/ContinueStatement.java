public class ContinueStatement {
    public static void main(String[] args) {
        // continue statement with for loop
        for(int j = 0; j <= 6; j++) {
            if(j == 4) {
                continue;
            }
            System.out.print(j + " ");
        }

        System.out.println(" ");

        // continue statement with while loop
        int counter = 10;
        while(counter >= 0) {
            if(counter == 7) {
                counter--;
                continue;
            }
            System.out.print(counter + " ");
            counter--;
        }

        System.out.println(" ");

        // contine statement with do while loop
        int j = 0;
        do {
            if(j == 7) {
                j++;
                continue;
            }
            System.out.print(j + " ");
            j++;
        } while(j < 10);
    }
}
