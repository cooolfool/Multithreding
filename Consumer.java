import static java.lang.Thread.sleep;

public class Consumer implements Runnable {

    private Company c;

    Consumer(Company c) {
        this.c = c;
    }

    public void run() {
        while (true) {
            c.cosume_data();
            try {
                sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}
