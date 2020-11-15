package demo5;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

public class test3_2 {
    public static void main(String[] args) {
       // System.out.println("ForkJoin sum demo in:  "+measureSumPerf(test3_2::forkJoinSum,10_000_000));
        System.out.println(forkJoinSum(10000));
    }
    public static long forkJoinSum(long n){
        long[] numbers= LongStream.rangeClosed(1,n).toArray();
        ForkJoinTask<Long> task=new test2(numbers);
        return new ForkJoinPool().invoke(task);
    }
}
