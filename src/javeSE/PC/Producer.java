package javeSE.PC;

/**
 * @Classname Producer
 * @Description TODO 生产产品，将产品放置到共享空间中
 * @Date 2020/9/15 15:14
 * @Created by hmb.java.boy
 */
public class Producer implements Runnable {
    private Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                goods.set("哇哈哈", "矿泉水");
            } else {
                goods.set("旺仔", "小馒头");
            }

        }
    }
}