package javeSE.stream;

/**
 * @Classname Person
 * @Description TODO
 * @Date 2020/10/19 17:16
 * @Created by hmb.java.boy
 */
public class Person {
    private String name;
    private String age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public  Person getAperson(String name) {
        Person person = new Person();
        person.setName(name);
        return person;
    }
}