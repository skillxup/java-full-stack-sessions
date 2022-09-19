public class GarbageCollectionExample {
    public static void main(String[] args) {
        GarbageCollectionExample obj = new GarbageCollectionExample();
        obj = null;

        GarbageCollectionExample obj1 = new GarbageCollectionExample();
        GarbageCollectionExample obj2 = new GarbageCollectionExample();

        obj2 = obj1;
        System.gc();
    }

    protected void finalize() throws Throwable {
        System.out.println("Garbage collection is performed by JVM!");
    }
}