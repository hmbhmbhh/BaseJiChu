package javeSE.PC;

import java.util.Date;

/**
 * @Classname WaitMethod
 * @Description TODO
 * @Date 2020/9/16 11:07
 * @Created by hmb.java.boy
 */
public class WaitMethod implements Runnable {
    public static void main(String[] args) {
        WaitMethod waitMethod = new WaitMethod();
        Thread thread = new Thread(waitMethod);
        System.out.println("1--------"+"thred" + thread);
        synchronized (thread) {
            try {
                /** 启动线程 */
                System.out.println("2--------"+Thread.currentThread().getName() + "   start  thread");
                thread.start();
                /** 主线程等待t1通过notify唤醒 */
                System.out.println("3--------"+Thread.currentThread().getName() + "wait()");
                thread.wait();
                System.out.println("4--------"+Thread.currentThread().getName() + " continue" + new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("5--------"+"this" + this);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.notify();
            System.out.println("6--------"+Thread.currentThread().getName() + "call notify()");
        }
    }
}