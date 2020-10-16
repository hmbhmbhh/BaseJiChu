package javeSE.lambda.level2;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Classname LambdaStatic
 * @Description TODO 静态方法的引用
 * @Date 2020/10/15 10:46
 * @Created by hmb.java.boy
 */
public class LambdaStatic {
    public static void main(String[] args) {
        /** Supplier---代表一个输出 */
        Supplier<String> result = () -> getName();
        System.out.println(result.get());

        Supplier<String> String = LambdaStatic::getName;
        System.out.println(String.get());


        Supplier<Integer> rlt = () -> LambdaStatic.getAge(7);
        System.out.println(rlt.get());

        Supplier<Integer> rlt1 = LambdaStatic::getAge;
        System.out.println(rlt1.get());
        /** Consumer---代表一个输入 */
        Consumer<String> c1 = (d) -> LambdaStatic.getName();
        c1.accept("huehu");
        Consumer<String> c = LambdaStatic::getName;
        c.accept("dsadasdas");

        /** Function---一个输入一个输出 */
        Function<String, Integer> f1 = LambdaStatic::getScore;
        System.out.println(f1.apply("000"));
        /** BiFunction---两个输入一个输出 */
        BiFunction<String, String, Integer> f = LambdaStatic::getScore;
        System.out.println(f.apply("ew", "rt"));
    }


    static void getName(String s) {
        System.out.println(s);
    }

    static Integer getAge() {
        return 1000000;
    }

    static Integer getAge(Integer age) {
        return age;
    }

    static String getName() {
        return "hello";
    }

    static Integer getScore(String name) {
        return name.length();
    }

    static Integer getScore(String name, String na) {
        return name.length() + na.length();
    }
}