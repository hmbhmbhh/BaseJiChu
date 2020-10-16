package javeSE.lambda.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Classname LambdaConstruction
 * @Description TODO 构造方法引用
 * @Date 2020/10/16 15:34
 * @Created by hmb.java.boy
 */
public class LambdaConstruction {
    public static void main(String[] args) {
        Supplier<Marian> supplier = () -> new Marian();
        supplier.get();

        Supplier<Marian> supplier1 = Marian::new;
        supplier1.get();

        Supplier<List> supplier2= ArrayList::new;

        Consumer<String> consumer =(e)->new Marian(e);
        consumer.accept("哈哈哈哈哈哈");

        Consumer<String> consumer1=Marian::new;
        consumer1.accept("okokokokokokokokok");

        Function<String, Marian> function = (r) -> new Marian(r);
        function.apply("wosai");

        Function<String,Marian> function1=Marian::new;
        function1.apply("ppppppppppp");
    }
}

class Marian {
    public Marian() {
        System.out.println("无参构造");
    }

    public Marian(String s) {
        System.out.println("有参构造：" + s);
    }
}