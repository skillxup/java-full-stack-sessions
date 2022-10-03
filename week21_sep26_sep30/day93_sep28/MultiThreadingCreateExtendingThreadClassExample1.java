class MultiThreadingCreateExtendingThreadClassExample1 extends Thread {
    public void run() {
        System.out.println("My thread is in running state.");
    }
    public static void main(String[] args) {
        MultiThreadingCreateExtendingThreadClassExample1 obj = new MultiThreadingCreateExtendingThreadClassExample1();
        obj.start();
    }
}