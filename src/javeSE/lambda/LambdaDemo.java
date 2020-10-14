package javeSE.lambda;

import java.util.*;

/**
 * @Classname LambdaDemo
 * @Description TODO lambda简单表达式
 * @Date 2020/10/14 10:47
 * @Created by hmb.java.boy
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //eg.1
        //-----------------------原始写法-----------------------------------
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
            }
        });
        thread.start();

        //------------------------Lambda表达式----------------------------
        new Thread(() -> {
            System.out.println("2");
        }).start();
        new Thread(()-> System.out.println(4)).start();

        //eg.2
        List<String> list = Arrays.asList("ds", "dss", "dasdad", "哈哈哈哈哈哈");
        //-----------------------原始写法-----------------------------------
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for (String s : list) {
            System.out.println(s);
        }
        //------------------------Lambda表达式----------------------------
        Collections.sort(list, (a, b) -> a.length() - b.length());
        list.forEach(System.out::println);

    }

}