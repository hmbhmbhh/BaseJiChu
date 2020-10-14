package javeSE.lambda.level1;

import com.sun.javafx.image.IntPixelGetter;

/**
 * @Classname Studet
 * @Description TODO
 * @Date 2020/10/14 14:56
 * @Created by hmb.java.boy
 */
public class Student {
    private String name;
    private Integer age;
    private Integer score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, Integer age, Integer score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}