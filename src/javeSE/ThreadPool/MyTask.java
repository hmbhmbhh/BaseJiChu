package javeSE.ThreadPool;

/**
 * @Classname MyTask
 * @Description TODO
 * @Date 2020/9/17 11:01
 * @Created by hmb.java.boy
 */
public class MyTask implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"hello world");
    }
}