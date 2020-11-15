package Threddemo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadExple {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService
                = Executors.newScheduledThreadPool(1);
        word1();
        scheduledExecutorService.schedule(ThreadExple::word2,10, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();

    }
    public static void word1(){
        System.out.println("hello word1");
    }
    public static void word2(){
        System.out.println("hello word2");
    }
}
