package javeSE.PC;

/**
 * @Classname Goods
 * @Description TODO
 * @Date 2020/9/15 16:01
 * @Created by hmb.java.boy
 */
public class Goods {

    private String brand;
    private String name;
    /** 保证先生产后消费的顺序   默认没有产品需要去先生产 */
    private boolean flag = false;


    public Goods() {

    }

    public Goods(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /** 生产者方法 */
    public synchronized void set(String brand, String name) {
        /** 如果true,证明有产品需要去先消费，此时等待这个共享对象，不往下执行
         * 因为cpu资源是公平竞争，所以需要这个变量来控制方法执行
         * */
        if (flag) {
            try {
                /** main方法等待，wait方法是指当前主线程进行等待且释放锁，生产者去执行生产产品 */
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setBrand(brand);
        this.setName(name);
        System.out.println("生产者生产了" + this.getBrand() + "----" + this.getName());
        /** 此时生产完需要将产品的状态改为true */
        flag = true;
        /** 用来唤醒main主线程继续执行 */
        notify();
    }

    /** 消费者方法 */
    public synchronized void get() {
        /** 当消费者抢占到CPU资源先判断是否有产品，如果true,先去消费 */
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费者取走了" + this.getBrand() + "---------" + this.getName());
        flag = false;

        notify();
    }
}