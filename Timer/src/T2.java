public class T2 extends Thread{
    private Count timer;
    private String messag;

    public T2(Count timer, String message) {
        this.timer = timer;
        this.messag = messag;
    }
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            int n;
            try {
                n = timer.last();
                System.out.println(n);
                if (n % 5 == 0);
                    System.out.println(messag);
                } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
