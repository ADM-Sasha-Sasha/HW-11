class T2 extends Thread {

    private Chrono app;
    private String message;

    public T2(Chrono app, String message) {
        this.app = app;
        this.message = message;
    }

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            int n;
            try {
                n = app.last();
                System.out.println(n);
                if (n % 5 == 0)
                    System.out.println(message);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}