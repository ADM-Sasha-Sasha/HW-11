public class Chronometr {
    public int time = 0;
    public void countTime (Messager m, Messager m1, int period) {
        for (int i = 0; i < period; i++) {
            synchronized (this) {
                time+=1;
                System.out.println(time);
                if (i == period - 1) {
                    Messager.finish = true;
                    m.flag = false;
                    this.notify();
                    m1.flag = false;
                    this.notify();
                }
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
