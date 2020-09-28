package javeSE.fanxing;

/**
 * @Classname Employee
 * @Description TODO 基类
 * @Date 2020/9/28 14:23
 * @Created by hmb.java.boy
 */
public class Employee {

    /** 性别 */
    public enum Gender {
        Boy("男"), Girl("女");
        private String name;

        Gender(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }

    private Integer id;
    private String name;
    private String age;

    public Employee() {
    }

    public Employee( Integer id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}