class Count extends Thread {
    Count() {
        super("my extending thread");
        System.out.println("my thread created: " + this);
        start();
    }

    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                System.out.println("Printing the count: " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}

class MultiThreadingCount {
    public static void main(String[] args) {
        Count cnt = new Count();
        try {
            while(cnt.isAlive()) {
                System.out.println("main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        } catch(InterruptedException e) {
            System.out.println("main thread interrupted");
        }
        System.out.println("main thread's run is over");
    }
}