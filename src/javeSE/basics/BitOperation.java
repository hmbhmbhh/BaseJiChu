package javeSE.basics;

/**
 * @Classname BitOperation
 * @Description TODO 位运算符   右移,向右移动n位就是除以2的n次幂，向左移动n位就是乘以2的n次幂
 * @Date 2020/9/25 15:43
 * @Created by hmb.java.boy
 */
public class BitOperation {
    public static void main(String[] args) {
        //12/2的一次方
        System.out.println(12 >> 1);
        //12/2的2次方=12/4
        System.out.println(12 >> 2);
        //12*2的一次方
        System.out.println(12 << 1);
    }
}