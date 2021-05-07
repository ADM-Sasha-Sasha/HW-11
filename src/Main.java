public class Main {
    private static Integer i = 1;

    public static void main(String[] args) throws InterruptedException {
        synchronized (i) {
            Thread first = new Thread(new StopWatch(i), "thread 1");
            Thread second = new Thread(new Message(i), "thread 2");
            first.start();
            second.start();
            first.join();
            second.start();
            first.interrupt();
            second.interrupt();
        }
    }
}
