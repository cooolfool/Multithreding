import static java.lang.Thread.sleep;

public class Producer implements Runnable {
    private Company c;

    Producer(Company c) {
        this.c = c;
    }

    public void run() {
        int i = 1;
        while (true) {
            c.produce_data(i);
            i++;
            try {
                sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
