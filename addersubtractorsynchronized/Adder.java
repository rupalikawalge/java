package addersubtractorsynchronized;

public class Adder implements Runnable {
    private Count count;

    Adder(Count count){
       this.count = count;
    }

    @Override
    public void run() {
        for (int i=0; i<=100; i++){
            synchronized (count){
                count.value += i;
            }

        }
    }
}
