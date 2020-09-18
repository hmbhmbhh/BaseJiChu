package javeSE.PC1;

import java.util.concurrent.BlockingQueue;

/**
 * @Classname ProducerQueue
 * @Description TODO JavaUtilConcurrent包进行编码,帮助我们做了等待唤醒的过程，jdk1.5出现的功能
 * @Date 2020/9/16 14:36
 * @Created by hmb.java.boy
 */
public class ProducerQueue implements Runnable {
    /** 加入泛型 */
    private BlockingQueue<Goods> blockingDeque;

    public ProducerQueue(BlockingQueue<Goods> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Goods goods = null;
            if (i % 2 == 0) {
                goods = new Goods("哇哈哈", "矿泉水");
            } else {
                goods = new Goods("旺仔", "小馒头");
            }
            System.out.println("生产者开始生产商品：" + goods.getBrand() + "--" + goods.getName());
            try {
                blockingDeque.put(goods);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}