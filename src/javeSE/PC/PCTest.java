package javeSE.PC;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/9/15 16:10
 * @Created by hmb.java.boy
 */
public class PCTest {
    public static void main(String[] args) {
        Goods goods = new Goods();
        Consumer consumer = new Consumer(goods);
        Producer producer = new Producer(goods);
        Thread thread = new Thread(consumer);
        Thread thread1 = new Thread(producer);
        thread.start();
        thread1.start();
    }
}