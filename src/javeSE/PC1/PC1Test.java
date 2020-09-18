package javeSE.PC1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 * @Classname PC1Test
 * @Description TODO JUC包测试
 * @Date 2020/9/16 14:48
 * @Created by hmb.java.boy
 */
public class PC1Test {
    public static void main(String[] args) {
        BlockingQueue<Goods> goods = new ArrayBlockingQueue<Goods>(5);
        ProducerQueue producerQueue = new ProducerQueue(goods);
        ConsumerQueue consumerQueue = new ConsumerQueue(goods);
        new Thread(producerQueue).start();
        new Thread(consumerQueue).start();
    }
}