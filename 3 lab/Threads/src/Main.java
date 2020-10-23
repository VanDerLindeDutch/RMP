class Main {
    Main() {
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started..");
        Name name = new Name("Thread");
        Thread nameThread = new Thread(new NameThread(name, 1));
        Thread nameThread2 = new Thread(new NameThread(name, 2));
        nameThread.start();
        nameThread2.start();
        System.out.println("Main thread finished");
    }
}
