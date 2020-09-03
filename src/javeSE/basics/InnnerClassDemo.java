package javeSE.basics;

/**
 * @Classname InnnerClassDemo
 * @Description TODO
 * @Date 2020/8/27 11:02
 * @Created by hmb.java.boy
 */
public class InnnerClassDemo {
    public static void main(String[] args) {
        /** 调用内部类方法 */
        InnnerIn innnerIn = new InnnerClassDemo().new InnnerIn();
        innnerIn.sd();
        innnerIn.ss();
        int a = innnerIn.ada;
        System.out.println(a);
    }

    private int ada = 89;


    class InnnerIn {
        private int ada = 9;

        /**
         * @Description: 方法功能描述：内部类方法
         * @param: * @param null
         * @return:
         */
        public void sd() {
            System.out.println("内部类sd方法");
            /** 当两个属性名称相同时，如果需要访问外部类属性，需要===外部类名.this.属性名 */
            System.out.println(InnnerClassDemo.this.ada);
            String variable = "Hello World";
        }

        private void ss() {
            System.out.println("hhh");
        }
    }
}