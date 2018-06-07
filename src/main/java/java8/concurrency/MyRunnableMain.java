package java8.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by joyghosh on 04/06/18.
 */
public class MyRunnableMain {

    private static final int NTHREADS = 10;

    public static void main(String[] args){
        try {
            ExecutorService executorService = Executors.newFixedThreadPool(NTHREADS);
            for (int i = 0; i < 500; i++) {
                Runnable runnable = new MyRunnable(10000000L + i);
                executorService.execute(runnable);
            }

            executorService.awaitTermination(10L, TimeUnit.SECONDS);
            executorService.shutdown();
            System.out.println("Finished executing all threads.");
        }catch (InterruptedException ex){
            System.err.println(ex);
        }
    }
}
