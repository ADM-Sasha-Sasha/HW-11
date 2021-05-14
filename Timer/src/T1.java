public class T1 extends Thread {
    private Count timer;

    public T1(Count timer) {
        this.timer = timer;
    }

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            this.timer.add();
        }
    }
}
