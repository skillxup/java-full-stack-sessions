import java.util.HashSet;

class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();

        hset.add("AA");
        hset.add("BB");
        hset.add("CC");
        hset.add("DD");

        System.out.println("HashSet contains: ");
        for(String temp: hset) {
            System.out.println(temp);
        }
    }
}