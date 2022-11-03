import java.util.Arrays;

class ParallelSortBySpecStartEndIndex {
    public static void main(String[] args) {
        int numbers[] = {32, 56, 98, 45, 28, 73};

        // converting the aaray to stream and displaying using forEach
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));

        // parallel sort method for sorting int array
        Arrays.parallelSort(numbers, 1, 5);

        System.out.println(" ");

        // converting the aaray to stream and displaying using forEach
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
    }    
}
