package javeSE.lambda.level2;

import java.util.function.*;

/**
 * @Classname LambdaObject
 * @Description TODO 对象方法引用用的比较少，必须传入一个类型进去
 * @Date 2020/10/15 14:53
 * @Created by hmb.java.boy
 */
public class LambdaObject {
    public static void main(String[] args) {
        Consumer<MyClass> s = MyClass::hhh;
        s.accept(new MyClass());
        //需要传入类型
        BiConsumer<MyClass, String> biConsumer = MyClass::show;
        biConsumer.accept(new MyClass(), "dsd");

        Supplier<String> s1 = () -> new MyClass().www("sds");
        System.out.println(s1.get());

        Function<String, String> f = (c) -> c;
        System.out.println(f.apply("dsfsf"));

        Function<String, Integer> f1 = (v) -> new MyClass().rtt(v);
        System.out.println(f1.apply("rewrwer"));

        BiFunction<Man,Integer,Integer> biFunction=Man::gg;
        System.out.println(biFunction.apply(new Man(), 9099));

    }

}
class Man{
    public int gg(int cs){
        return cs;
    }
}
class MyClass {
    public void hhh() {
        System.out.println("kk");
    }

    public void show(String hj) {
        System.out.println("why:::" + hj);
    }

    public String www(String name) {
        return name;
    }

    public int rtt(String name) {
        return name.length();
    }
}