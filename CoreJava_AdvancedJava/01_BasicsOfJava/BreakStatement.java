public class BreakStatement {
    public static void main(String[] args) {
        // break statement with while
        int num = 0;
        while(num <= 100) {
            System.out.print(num + " ");
            if(num == 2) {
                break;
            }
            num++;
        }

        System.out.println(" ");

        // break statement with for
        int var;
        for(var = 100; var >= 10; var--) {
            System.out.println(var + " ");
            if(var == 98) {
                break;
            }
        }

        System.out.println(" ");
    }
}
