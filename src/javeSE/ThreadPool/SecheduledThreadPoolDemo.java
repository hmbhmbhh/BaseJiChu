package javeSE.ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Classname SecheduledThreadPoolDemo
 * @Description TODO
 * @Date 2020/9/17 15:21
 * @Created by hmb.java.boy
 */
public class SecheduledThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        //给定延迟执行任务
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟三秒执行");
            }
        },3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}