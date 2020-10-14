package javeSE.lambda.level1;

import java.util.ArrayList;

/**
 * @Classname StuTest
 * @Description TODO 一个接口中有且只有一个抽象方法的叫做函数式接口,这个接口可以直接使用Lambda来进行编写
 * @Date 2020/10/14 14:59
 * @Created by hmb.java.boy
 */
public class StuTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("侯一", 19, 55));
        students.add(new Student("王二", 13, 35));
        students.add(new Student("李三", 15, 75));
        students.add(new Student("赵四", 18, 15));
        students.add(new Student("刘五", 13, 25));
        students.add(new Student("孙六", 34, 52));
        students.add(new Student("武七", 26, 95));
//        getResult(students, new StudentInterface() {
//            @Override
//            public boolean getByFilter(Student Student) {
//                return Student.getAge()>10;
//            }
//        });
//        getResult(students,(a)->a.getName().length()>1);
        getResult(students,(w)->w.getScore()>50);
    }

    public static void getResult(ArrayList<Student> List, StudentInterface StudentInterface) {
        for (Student student1 : List) {
            if (StudentInterface.getByFilter(student1)){
                System.out.println(student1);

            }
        }
    }
}