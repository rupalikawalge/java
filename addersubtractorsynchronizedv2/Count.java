package addersubtractorsynchronizedv2;

public class Count {
    private int value = 0;

    public synchronized void incrementValue(int x){
        value += x;
    }
    public int getValue(){
        return value;
    }
}
