public class NumThread implements Runnable {
    public NumThread() {
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " started..");

        for(int i = 0; i < 100; ++i) {
            System.out.println(i);
        }

        System.out.println(Thread.currentThread().getName() + " finished..");
    }
}
