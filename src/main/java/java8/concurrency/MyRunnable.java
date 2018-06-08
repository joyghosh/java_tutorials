package java8.concurrency;

/**
 * Created by joyghosh on 04/06/18.
 */
public class MyRunnable implements Runnable{

    private final long countUntil;

    MyRunnable(long countUntil){
        this.countUntil = countUntil;
    }

    @Override
    public void run() {
        long sum = 0L;
        for(long i=1; i<countUntil; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
