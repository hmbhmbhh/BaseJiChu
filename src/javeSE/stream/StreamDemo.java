package javeSE.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Classname StreamDemo
 * @Description TODO    stream的创建，只要返回stream的类型结果，意味着就是一个中间操作
 * @Date 2020/10/19 11:08
 * @Created by hmb.java.boy
 */
public class StreamDemo {
    public static void main(String[] args) {
//        do1();
//        do2();
//        do3();
//        do4();
//        do5();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Stream<Integer> stream = list.stream();
        /** 偶数和 */
//        System.out.println(stream.filter(x -> x % 2 == 0).mapToInt(x -> x).sum());
        /** 总和 */
//        System.out.println(stream.mapToInt(x -> x).sum());
        /** 求最大值 */
//        System.out.println(stream.max((a, b) -> a - b).get());
        /** 最小值 */
//        System.out.println(stream.min((a, b) -> a - b).get());
        /** 取任意一个值 */
//        System.out.println(stream.filter(x -> x % 2 != 0).findAny().get());
        /** 取第一个值 */
//        System.out.println(stream.filter(x -> x % 2 == 0).findFirst().get());
        /** todo 将集合中的数据过滤后返回一个集合，此方法用的比较多 */
//        List<Integer> collect = stream.filter((x) -> x % 2 == 0).collect(Collectors.toList());
//        collect.forEach(System.out::println);
        /** 去重操作 */
//        Arrays.asList(1,2,3,3,4,5,6,6,6,6,7,8,8,9).stream().distinct().collect(Collectors.toList()).forEach(System
//        .out::println);
        /** 打印20-30的数据
         * 创建stream，最多50，跳过20位数，往后去10位数，转为集合 */
//        Stream.iterate(1,x->x+1).limit(50).skip(20).limit(10).collect(Collectors.toList()).forEach(System
//        .out::println);
        String s = "11,22,33,44,55";
//        System.out.println(Stream.of(s.split(",")).mapToInt((x) -> Integer.parseInt(x)).sum());
//        System.out.println(Stream.of(s.split(",")).mapToInt(Integer::valueOf).sum());
        /** 常见一组自定义对象 */
//        String s1="java,per,shiro";
//        Stream.of(s1.split(",")).map((a)->new Person().getAperson(a)).forEach(System.out::println);
        /** 将s的每一个数值打印出来，同时算总和结果 */
        System.out.println(Stream.of(s.split(",")).peek(System.out::println).mapToInt(Integer::valueOf).sum());
        //判断。。。
        System.out.println(list.stream().allMatch(x -> x % 2 == 0));
    }

    /**
     * @Description: 方法功能描述：通过数组方式生成
     * @param: * @param null
     * @return:
     */
    public static void do1() {
        String[] i = {1 + "", 2 + "", 3 + "", 4 + "", 5 + "", 6 + "", 7 + "", 8 + "", 9 + "", 10 + ""};
        Stream<String> i1 = Stream.of(i);

//        i1.forEach(System.out::println);
        /** 转为int类型进行输出：方式1 */
//        i1.map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s);
//            }
//        }).forEach(System.out::println);
        /** 转为int类型进行输出：方式2：下面两种方法相同 */
        Stream<Integer> integerStream1 = i1.map((str) -> Integer.parseInt(str));
        Stream<Integer> integerStream = i1.map(str -> Integer.parseInt(str));
        integerStream.forEach(System.out::println);
    }

    /**
     * @Description: 方法功能描述：通过集合来生成
     * @param: * @param null
     * @return:
     */
    public static void do2() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().forEach(System.out::println);
    }

    /**
     * @Description: 方法功能描述：通过generate创建stream
     * @param: * @param null
     * @return:
     */
    public static void do3() {
        Stream<Integer> generate = Stream.generate(() -> 1);
//        此时会无限输出结果1
//        generate.forEach(System.out::println);
        /** 需要limit限制流元素的个数 */
        generate.limit(4).forEach(System.out::println);
    }

    /**
     * @Description: 方法功能描述：iterate方式创建stream
     * @param: * @param null
     * @return:
     */
    public static void do4() {
        Stream<Integer> iterate = Stream.iterate(1, (x) -> x + 1);
        iterate.limit(10).forEach(System.out::println);
    }

    /**
     * @Description: 方法功能描述：stream运行的特点
     * todo stream是把集合每一个元素先执行filter然后在执行后面的逻辑；所以第一个集合的filter过滤到符合条件的2就不会往下执行了，所以打印出两次代码运行，分别是过滤的1，2；第二个集合打印出4条，分别是1
     * ，3，5，6的代码二
     * @param: * @param null
     * @return:
     */
    public static void do5() {
        //第一个集合
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 8);
        Stream<Integer> integerStream = list.stream().filter(i -> {
            System.out.println("代码运行");
            return i % 2 == 0;
        });
        System.out.println(integerStream.findAny().get());
        //第二个集合
        Stream<Integer> integerStream1 = Arrays.asList(1, 3, 5, 6, 7, 8).stream().filter(u -> {
            System.out.println("代码二");
            return u % 2 == 0;
        });
        System.out.println(integerStream1.findAny().get());
    }
}