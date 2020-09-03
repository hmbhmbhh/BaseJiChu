package javeSE.basics;

/**
 * @Classname eventEnumTest
 * @Description TODO
 * @Date 2020/8/28 16:28
 * @Created by hmb.java.boy
 */
public enum EventEnumTest {
    Launch("launch"), Food("food");

    EventEnumTest(String name) {
        this.name = name;
    }

    private String name;
    public void show(){
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        String name = EventEnumTest.Food.name;
        System.out.println(name);
        EventEnumTest.Launch.show();
    }
}
