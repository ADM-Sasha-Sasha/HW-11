public class Message implements Runnable{
    private static int i;

    public Message(int i) {
        this.i = i;
    }

    synchronized void useMessage(int i) throws InterruptedException {
        while (!Thread.currentThread().isInterrupted()) {
            if ((i % 5 == 0)&&(i / 5 > 0)) {
                System.out.println("Test");
                System.out.println(i++);
                //StopWatch.startStopWatch() = true;
                this.notify();
            }
            this.wait();
        }
    }

    @Override
    public void run() {
        try {
            useMessage(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
