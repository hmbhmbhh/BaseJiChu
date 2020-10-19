package javeSE.basics;

import java.util.Date;

/**
 * @Classname StringTest
 * @Description TODO 对于任何两个字符串s和t ， s.intern() == t.intern()是true当且仅当s.equals(t)是true
 * @Date 2020/8/28 10:28
 * @Created by hmb.java.boy
 */
public class StringTest {
    public static void main(String[] args) {
        /** a,a1,a2,a3分别是四个对象，在方法区开辟四块空间，
         * a6
         * 判断字符串首先看它的地址是否精准
         * c的地址是精准的，就是返回一个字符串，所以b==c true
         * 而a6所指向的a1+a2+a3，不知道是什么，不确定地址
         * 所以false
         * */
        String a = "a";
        String a1 = "b";
        String a2 = "c";
        String a3 = "abc";
        String a6 = a + a1 + a2;
        String a7 = (a + a1 + a2).intern();

        System.out.println(a3 == a6);
        System.out.println(a3 == a7);

        String b = "asd";
        String c = "a" + "s" + "d";
        System.out.println(b == c);
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

}