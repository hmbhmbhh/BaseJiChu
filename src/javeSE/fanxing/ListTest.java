package javeSE.fanxing;

import java.util.*;

/**
 * @Classname TEst
 * @Description TODO 集合测试
 * @Date 2020/9/28 14:55
 * @Created by hmb.java.boy
 */
public class ListTest {
    public static void main(String[] args) {
        ItHuman itHuman = new ItHuman();
        itHuman.setPopularity("66");
        itHuman.setAge("22");
        itHuman.setId(1);
        itHuman.setName("腾讯炸");
        itHuman.setGender(Employee.Gender.Boy.getName());
        ItHuman itHuman1 = new ItHuman();
        itHuman1.setAge("56");
        itHuman1.setPopularity("999");
        itHuman1.setId(2);
        itHuman1.setName("马云宝");
        itHuman1.setGender(Employee.Gender.Boy.getName());
        Pm pm = new Pm();
        pm.setAge("34");
        pm.setId(1);
        pm.setName("熊大");
        pm.setWorkOfYear("09年");
        Pm pm1 = new Pm();
        pm1.setAge("14");
        pm1.setId(2);
        pm1.setName("光头强");
        pm1.setWorkOfYear("7年");
        Pm pm2 = new Pm();
        pm2.setAge("24");
        pm2.setId(3);
        pm2.setName("会陶朗");
        pm2.setWorkOfYear("6年");
        Pm pm3 = new Pm();
        pm3.setAge("24");
        pm3.setId(4);
        pm3.setName("会陶朗");
        pm3.setWorkOfYear("9年");
        ArrayList<ItHuman> itHumen = new ArrayList<>();
        itHumen.add(itHuman);
        itHumen.add(itHuman1);
//        for (ItHuman human : itHumen) {
//            int size = itHumen.size();
//            System.out.println("集合中的个数："+size+"；排名：" + human.getId() + ";名字：" + human.getName() + ";年龄：" + human
//            .getAge() +
//                    ";" +
//                    "性别：" + human.getGender() +
//                    ";人气值：" + human.getPopularity());
//        }
        LinkedList<ItHuman> itHumen1 = new LinkedList<>();

        itHumen1.add(itHuman);
        itHumen1.add(itHuman1);
//        for (ItHuman human : itHumen1) {
//            System.out.println("集合中的个数："+itHumen1.size()+"；排名：" + human.getId() + ";名字：" + human.getName() + ";年龄："
//            + human.getAge() +
//                    ";" +
//                    "性别：" + human.getGender() +
//                    ";人气值：" + human.getPopularity());
//        }
//        HashSet<Pm> pms = new HashSet<>();
//        pms.add(pm);
//        pms.add(pm1);
//        pms.add(pm2);
//        for (Pm pm3 : pms) {
//            System.out.println("集合中的个数："+pms.size()+"；排名：" + pm3.getId() + ";名字：" + pm3.getName() + ";年龄：" + pm3
//            .getAge() +
//                    ";" +
//                    "性别：" + pm3.getGender() +
//                    ";工作年限：" + pm3.getWorkOfYear());
//        }
        TreeSet<Pm> pms = new TreeSet<>();
        pms.add(pm);
        pms.add(pm1);
        pms.add(pm2);
        pms.add(pm3);
        boolean empty = pms.isEmpty();
        System.out.println(empty);
        for (Pm pm4 : pms) {
            System.out.println("集合中的个数：" + pms.size() + "；排名：" + pm4.getId() + ";名字：" + pm4.getName() + ";年龄：" + pm4.getAge() +
                    ";" +
                    ";工作年限："
                    + pm4.getWorkOfYear());
        }
    }
}