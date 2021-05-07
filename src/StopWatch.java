public class StopWatch implements Runnable{

    private static int i;
    public static boolean startStopWatch = false;

    public StopWatch(int i) {
        this.i = i;
    }

    public static boolean startStopWatch() {
        return false;
    }

    synchronized void countDown(int i) {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
                i++;

                if (i % 5 == 0) {
                    Thread.sleep(1000);
                    System.out.println(i);
                    this.notifyAll();
                    while (!startStopWatch) {
                        this.wait();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        countDown(i);
    }
}
