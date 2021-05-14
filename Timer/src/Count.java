public class Count {
    private int i = 0;
    public synchronized void add() {
        this.i++;
        notify();
    }
    public synchronized int last() throws InterruptedException {
        wait();
        return this.i;
    }
}
