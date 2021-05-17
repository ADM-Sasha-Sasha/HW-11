class Chrono {

    private int d = 0;

    public synchronized void add() {
        this.d++;
        notify();
    }

    public synchronized int last() throws InterruptedException {
        wait();
        return this.d;
    }
}
