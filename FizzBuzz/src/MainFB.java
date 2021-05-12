import java.util.Arrays;

public class MainFB {

    public static void main(String[] args) {
        FizzBuzz fizzbuzz = new FizzBuzz(30);
        Thread A = new Thread(()-> {
            try {
                fizzbuzz.fizz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread B = new Thread (()->{
            try {
                fizzbuzz.buzz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread C = new Thread (()-> {
            try {
                fizzbuzz.fizzbuzz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread D = new Thread (()-> {
            try {
                fizzbuzz.otherNumber();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        for (Thread t : Arrays.asList(A, B, C, D)) {
            t.start();
        }
    }
}
