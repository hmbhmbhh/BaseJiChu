package javeSE.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Classname FixedThreadPoolDemo
 * @Description TODO
 * @Date 2020/9/17 11:14
 * @Created by hmb.java.boy
 */
public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        /** 每次最多5个线程 */
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
//            executorService.submit(new MyTask());
            executorService.execute(new MyTask());
        }
        executorService.shutdown();
    }
}