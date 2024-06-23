package addersubtractorsynchronizedv2;

public class Adder implements Runnable{
   private Count count;

   Adder(Count count){
       this.count = count;
   }

    @Override
    public void run() {
        for (int i=1; i<=100; i++){
            count.incrementValue(i);
        }

    }
}
