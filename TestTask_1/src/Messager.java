public class Messager implements Runnable{
    private int time;
    public static boolean finish = false;
    public boolean flag = true;
    public Chronometr ch;

    Messager(int time, Chronometr ch) {
        this.time = time;
        this.ch = ch;
    }
    public void waitForTime() {
        while (true) {
            synchronized (ch) {
                try {
//                    while (flag)
//                        ch.wait();
//                    if (finish) return;
                    if (ch.time % this.time == 0) {
                        System.out.println("Thread" + this.time);
                        ch.wait();
                        if (finish) return;
                       // flag = true;
                    }
                   // flag = true;
                } catch (InterruptedException e) {

                }
            }
        }
    }
    @Override
    public void run() {
        waitForTime();
        System.out.println("End");
    }
}
