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
        Producer producer = new Producer(goods);
        Consumer consumer = new Consumer(goods);
        Thread thread1 = new Thread(producer);
        Thread thread = new Thread(consumer);
        thread1.start();
        thread.start();

    }
}