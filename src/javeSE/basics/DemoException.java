package javeSE.basics;

/**
 * @Classname DemoException
 * @Description TODO
 * @Date 2020/8/27 10:15
 * @Created by hmb.java.boy
 */
public class DemoException {
    public static void main(String[] args) {
        dataConvet("   tei 22");
    }

    /** 数据转换 */
    public static void dataConvet(String data) {
        if (data == null) {
            return;
        }
        try {
            int i = Integer.parseInt(data);
            System.out.println("转换的数字：" + i);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("数据转换异常");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("异常");
        }

        class MyException extends Exception {

        }
    }
}