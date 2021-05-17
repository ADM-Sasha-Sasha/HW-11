public class Chronometr {

    public Chronometr(int lifetime) throws InterruptedException {
        Chrono chrono = new Chrono();
        T1 t1 = new T1(chrono);
        T2 t2 = new T2(chrono, "Прошло 5 сек");
        t1.start();
        t2.start();
        Thread.sleep(lifetime * 1000 + 100);
        t1.interrupt();
        t2.interrupt();
    }

    public static void main(String[] args) throws InterruptedException {
        new Chronometr(21);
    }
}