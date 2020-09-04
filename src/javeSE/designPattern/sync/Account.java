package javeSE.designPattern.sync;

import javax.swing.plaf.metal.MetalIconFactory;

/**
 * @Classname Account
 * @Description 同步代码块儿
 * @Date 2020/9/4 14:15
 * @Created by hmb.java.boy
 */
public class Account implements Runnable {
    /** 账户总金额 */
//    private Account account;
    static int accountss = 2000;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (accountss != 0) {
                /** 同步代码块儿 */
                synchronized (this) {
                    accountss -= 100;
                    System.out.println(Thread.currentThread().getName() + "取了100还剩:" + accountss);
                }
            }
        }
    }

    public static void main(String[] args) {
        Account account = new Account();
        Thread thread = new Thread(account);
        Thread thread1 = new Thread(account);
        Thread thread2 = new Thread(account);
        thread.setName("王五");
        thread.start();
        thread1.start();
        thread2.start();
        thread1.setName("赵四");
        thread2.setName("张三");


    }
}