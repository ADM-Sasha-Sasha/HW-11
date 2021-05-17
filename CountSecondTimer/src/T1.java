class T1 extends Thread {

    private Chrono app;

    public T1(Chrono app) {
        this.app = app;
    }

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            this.app.add();
        }
    }
}