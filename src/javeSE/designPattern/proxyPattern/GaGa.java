package javeSE.designPattern.proxyPattern;

/**
 * @Classname GaGa
 * @Description TODO
 * @Date 2020/9/3 15:37
 * @Created by hmb.java.boy
 */
public class GaGa implements HotGirl {
    @Override
    public void eyesAndMan() {
        System.out.println("嘎嘎游泳");
    }

    @Override
    public void playWithMan() {
        System.out.println("嘎嘎玩");
    }
}