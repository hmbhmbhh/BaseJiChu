package javeSE.designPattern.proxyPattern;

/**
 * @Classname MenQing
 * @Description 代理模式
 * 王婆是代理人，传参真正的干活的是金莲
 * @Date 2020/9/3 15:15
 * @Created by hmb.java.boy
 */
public class MenQing {
    public static void main(String[] args) {
        GaGa gaGa = new GaGa();
        WangPo gaga = new WangPo(gaGa);
        WangPo wangPo = new WangPo();
        wangPo.eyesAndMan();
        wangPo.playWithMan();
        gaga.eyesAndMan();
        gaga.playWithMan();
    }
}