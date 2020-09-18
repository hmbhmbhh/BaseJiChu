package javeSE.ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Classname SecheduledThreadPoolDemo2
 * @Description TODO 调度任务线程池
 * @Date 2020/9/17 15:38
 * @Created by hmb.java.boy
 */
public class SecheduledThreadPoolDemo2 {
    public static void main(String[] args) {
        //newScheduledThreadPool(参数)：要保留在池中的线程数，即使它们处于空闲状态
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        /** 参数
         command - 要执行的任务
         initialDelay - 延迟第一次执行的时间
         period - 连续执行之间的时期
         unit - initialDelay和period参数的时间单位  */
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("1------延迟1秒，每隔3秒执行");
                System.out.println(System.currentTimeMillis());

            }
        }, 1, 3, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("2------延迟1秒，每隔3秒执行");
                System.out.println(System.currentTimeMillis());
            }
        }, 1, 3, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("3------延迟1秒，每隔3秒执行");
                System.out.println(System.currentTimeMillis());
            }
        }, 1, 3, TimeUnit.SECONDS);
//        scheduledExecutorService.shutdown();
    }
}