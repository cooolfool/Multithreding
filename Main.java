public class Main {
    public static void main(String a[]) {
        Company c = new Company();
        Producer p = new Producer(c);
        Thread producer = new Thread(p);
        Consumer co = new Consumer(c);
        Thread consumer = new Thread(co);
        producer.start();
        consumer.start();
    }
}
