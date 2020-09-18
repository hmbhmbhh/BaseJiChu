package javeSE.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Classname CacheThreadPool
 * @Description TODO
 * @Date 2020/9/17 11:00
 * @Created by hmb.java.boy
 */
public class CacheThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
//            executorService.submit(new MyTask());
            executorService.execute(new MyTask());

        }
        /** 关闭 */
        executorService.shutdown();
    }
}