package javeSE.designPattern.proxyPattern;

/**
 * @Classname JinLian
 * @Description         被代理人
 * @Date 2020/9/3 15:14
 * @Created by hmb.java.boy
 */
public class JinLian implements HotGirl {
    @Override
    public void eyesAndMan() {
        System.out.println("金莲跑了");
    }

    @Override
    public void playWithMan() {
        System.out.println("金莲一起摇摆");
    }
}