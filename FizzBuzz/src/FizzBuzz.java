import java.util.StringJoiner;

public class FizzBuzz {
    private int first = 1;
    private int last;
    StringJoiner result = new StringJoiner(",");

    public FizzBuzz(int last) {
        this.last = last;
    }

    public synchronized void fizz() throws InterruptedException {
        while (first <= last) {
            if (first % 3 == 0 && first % 5 !=0) {
                result.add("fizz");
                first++;
                notifyAll();
            } else {
                wait();
            }
        }
        System.out.println(result);
    }
    public synchronized void buzz() throws InterruptedException {
        while (first <= last) {
            if (first % 5 == 0 && first % 3 !=0) {
                result.add("buzz");
                first++;
                notifyAll();
            } else {
                wait();
            }
        }
        System.out.println(result);
    }
    public synchronized void fizzbuzz() throws InterruptedException {
        while (first <= last) {
            if (first % 3 == 0 && first % 5 ==0) {
                result.add("FizzBuzz");
                first++;
                notifyAll();
            } else {
                wait();
            }
        }
        System.out.println(result);
    }
    public synchronized void otherNumber() throws InterruptedException {
        while (first <= last) {
            if (first % 5 != 0 && first % 3 !=0) {
                result.add(String.valueOf(first));
                first++;
                notifyAll();
            } else {
                wait();
            }
        }
    }
}
