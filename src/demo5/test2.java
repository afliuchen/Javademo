package demo5;

import java.util.concurrent.RecursiveTask;

public class test2 extends RecursiveTask<Long> {

    private final long[] numbers;
    private final int strat;
    private final int end;
    public static final long THRESHOLD=10_000;
    public test2(long[] numbers){
        this(numbers,0,numbers.length);
    }
    private test2(long[] numbers,int strat,int end){
        this.numbers=numbers;
        this.strat=strat;
        this.end=end;
    }

    @Override
    protected Long compute() {
        int length=end-strat;
        if (length<=THRESHOLD){
            return computeSequentially();
        }
        test2 leftTask=new test2(numbers,strat,strat+length/2);
        leftTask.fork();
        test2 rightTask=new test2(numbers,strat+length/2,end);
        Long rightResult=rightTask.compute();
        Long leftReult=leftTask.join();
        return leftReult+rightResult;
    }

    private Long computeSequentially() {
        long sum=0;
        for (int i=strat;i<end;i++){
            sum+=numbers[i];
        }
        return sum;
    }
}
