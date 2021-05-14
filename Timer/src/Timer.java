public class Timer {
    public Timer(int lifetime) throws InterruptedException {
        Count count = new Count();
        T1 t1 = new T1(count);
        T2 t2 = new T2(count, "Прошло 5 сек");
        t1.start();
        t2.start();
        Thread.sleep(lifetime * (1000 + 100));
        t1.interrupt();
        t2.interrupt();
    }

    public static void main(String[] args) throws InterruptedException {
        new Timer(10);
    }
}
