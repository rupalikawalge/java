package introtosynchronizatiiion;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        //so this is called synchronization [problem - whenever try to access same value from multiple places/thread
        Count count = new Count();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        //join() is used when one thread wait for completion for another
        t1.join();
        t2.join();

        System.out.print(count.value);
    }
}
