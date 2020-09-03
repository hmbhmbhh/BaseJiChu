package javeSE.basics;

/**
 * @Classname ThreadTest
 * @Description TODO
 * @Date 2020/9/1 14:32
 * @Created by hmb.java.boy
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread thread = new Thread(myRun);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i == 2) {
//                try {
                    /** 睡眠 */
                    //Thread.sleep(1000);
                    Thread.yield();
                System.out.println(Thread.currentThread().getName()+"礼让一次");
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }else {
                System.out.println(Thread.currentThread().getName()+"================"+i);
            }
        }
    }
}