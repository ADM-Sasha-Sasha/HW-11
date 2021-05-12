public class Test {
    public static void main(String[] args) {
        Chronometr my = new Chronometr();
        Runnable t1 = new Messager (5, my);
        Runnable t2 = new Messager (1, my);
        new Thread(t1, "t1").start();
        new Thread(t2, "t2").start();
        my.countTime((Messager) t1, (Messager) t2, 10);
    }
}
