class MultithreadingImplementsRunnable implements Runnable {
    public void run() {
        System.out.println("my thread is in running state");
    }
    public static void main(String[] args) {
        MultithreadingImplementsRunnable obj = new MultithreadingImplementsRunnable();
        Thread tobj = new Thread(obj);
        tobj.start();
    }
}
