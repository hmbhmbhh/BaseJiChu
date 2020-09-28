package javeSE.fanxing;

import java.util.Objects;

/**
 * @Classname Pm
 * @Description TODO set接口必须实现Comparable接口,重写排序规则,否则报错cannot be cast to java.lang.Comparable
 * @Date 2020/9/28 14:52
 * @Created by hmb.java.boy
 */
public class Pm extends Employee implements Comparable {
    /** 工作年限 */
    private String workOfYear;

    public Pm() {
    }


    public Pm(String workOfYear) {
        this.workOfYear = workOfYear;
    }

    public String getWorkOfYear() {
        return workOfYear;
    }

    public void setWorkOfYear(String workOfYear) {
        this.workOfYear = workOfYear;
    }


    @Override
    public int compareTo(Object o) {
        Pm pm = (Pm) o;
        Integer id = pm.getId();
        if (id > this.getId()) {
            return 1;
        }
        ;
        if (id < this.getId()) {
            return -1;
        } else {
            return 0;
        }

    }
}