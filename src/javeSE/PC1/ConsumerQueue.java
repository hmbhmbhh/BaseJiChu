package javeSE.PC1;


import java.util.concurrent.BlockingQueue;

/**
 * @Classname ConsumerQueue
 * @Description TODO
 * @Date 2020/9/16 14:38
 * @Created by hmb.java.boy
 */
public class ConsumerQueue implements Runnable{
    private BlockingQueue<Goods> blockingQueue;

    public ConsumerQueue(BlockingQueue<Goods> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                Goods goods = blockingQueue.take();
                System.out.println("消费者消费的商品是："+goods.getBrand()+"--"+goods.getName());
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}