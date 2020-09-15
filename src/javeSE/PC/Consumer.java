package javeSE.PC;

/**
 * @Classname Consumer
 * @Description TODO 消费者：从共享空间取走产品
 * @Date 2020/9/15 15:16
 * @Created by hmb.java.boy
 */
public class Consumer implements Runnable {
    private Goods goods;

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            goods.get();

        }
    }
}