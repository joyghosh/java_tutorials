package java8.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by joyghosh on 04/06/18.
 */
public class AtomicOperations {

    public static void main(String[] args){
        atomicInteger();
    }

    public static void atomicInteger(){
        AtomicInteger ai = new AtomicInteger();
        System.out.println(ai);
        System.out.println(ai.get());
        ai.getAndAdd(10);
        System.out.println(ai);
        ai.getAndIncrement();
        System.out.println(ai);
        ai.getAndDecrement();
        System.out.println(ai);
        ai.getAndSet(15);
        System.out.println(ai);
        System.out.println(ai.addAndGet(10));
        System.out.println(ai.incrementAndGet());
        System.out.println(ai.decrementAndGet());
        System.out.println(ai.doubleValue());
        System.out.println(ai.floatValue());
        System.out.println(ai.intValue());
        System.out.println(ai.toString());
        ai.compareAndSet(25,30);
        System.out.println(ai);
        ai.compareAndSet(31,32);
        System.out.println(ai);
        ai.accumulateAndGet(33,Math::max);
        System.out.println(ai);
    }
}
