package javeSE;

/**
 * @Classname ThreadTwo
 * @Description 两个线程交替执行
 * @Date 2020/9/1 14:47
 * @Created by hmb.java.boy
 */
public class ThreadTwo implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1001);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-----------"+i);
        }

    }
    public static void main(String[] args) {
        ThreadTwo threadTwo = new ThreadTwo();
        Thread thread = new Thread(threadTwo);
        thread.start();
        for (int i = 10; i >0 ; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"------------"+i);
        }

    }
}