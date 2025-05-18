public class Company {

    public int n;
    boolean produced = false;       //flag to check if producer has done its job

    synchronized void produce_data(int n) {
        if (produced) {    //if producer has done job, wait for consumer to finish
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n = n;
        System.out.println("Produced data : " + n);
        produced = true;
        notify(); //notify consumer to start
    }

    synchronized int cosume_data() {
        if (!produced) {  //if consumer has done job, wait for producer to finish
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumed data : " + n);
        produced = false;
        notify();  //notify producer to begin
        return this.n;
    }

}
