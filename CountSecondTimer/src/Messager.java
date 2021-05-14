public class Messager implements Runnable {
    private int time;
    //public static boolean finish = false;
    //public boolean flag = true;
    public Chronometr ch;

    Messager(int time, Chronometr ch) {
        this.time = time;
        this.ch = ch;
    }

    public void Msg () {
        synchronized (ch) {
            try {
                while (Chronometr.time % time != 0) {
//                    while (flag)
//                        ch.wait();
//                    if (finish) return;
                    ch.wait();
                }
                System.out.println("Прошло 5 сек" + this.time);
            } catch (InterruptedException e) {
            }
        }
//                    if (ch.time % this.time == 0) {
//                        System.out.println("Прошло 5 сек" + this.time);
//                        ch.wait();
//                        if (finish) return;
//                        // flag = true;
//                    }
//                    // flag = true;
//                } catch (InterruptedException e) {
//
//                }
//            }
//        }
    }

    @Override
    public void run() {
        Msg();
    }
}
