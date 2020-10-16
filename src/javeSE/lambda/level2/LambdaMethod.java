package javeSE.lambda.level2;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @Classname LambdaMethod
 * @Description TODO 实例方法引用
 * @Date 2020/10/15 11:12
 * @Created by hmb.java.boy
 */
public class LambdaMethod {
    public static void main(String[] args) {
        LambdaMethod lambdaMethod = new LambdaMethod();
        //Supplier一个输出   调用有返回值的方法
        Supplier<String> s = lambdaMethod::getName;
        System.out.println(s.get());
        //Consumer一个输入   调用无返回值的方法
        Consumer<String> s1 =lambdaMethod::getName;
        s1.accept("dsds");

    }

    public String getName() {
        return "s";
    }
    public void getName(String s) {
        System.out.println(s);
    }
}