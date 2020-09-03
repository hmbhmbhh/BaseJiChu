package javeSE.basics;

/**
 * @Classname JiCheng
 * @Description TODO
 * @Date 2020/8/25 11:01
 * @Created by hmb.java.boy
 */
public class JiCheng {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.print("");
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}