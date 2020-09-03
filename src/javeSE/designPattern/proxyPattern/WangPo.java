package javeSE.designPattern.proxyPattern;

/**
 * @author int
 * @Classname WangPo
 * @Description 王婆是代理人，实现了女孩接口
 * @Date 2020/9/3 14:57
 * @Created by hmb.java.boy
 */
public class WangPo implements HotGirl {
    /** 定义属性 */
    private HotGirl hotGirl;

    /**
     * @Description: 方法功能描述：无参构造
     * @param: 默认金莲
     * @return:
     */
    public WangPo() {
        this.hotGirl = new JinLian();
    }

    /**
     * @Description: 方法功能描述：有参构造
     * @param: * @param 可以重新定义类实现hotgril接口传参
     * @return:
     */
    public WangPo(HotGirl hotGirl) {
        this.hotGirl = hotGirl;
    }

    @Override
    public void eyesAndMan() {
        this.hotGirl.eyesAndMan();
    }

    @Override
    public void playWithMan() {
        this.hotGirl.playWithMan();
    }
}