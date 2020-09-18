package javeSE.PC1;

/**
 * @Classname Goods
 * @Description TODO
 * @Date 2020/9/16 16:01
 * @Created by hmb.java.boy
 */
public class Goods {

    private String brand;
    private String name;

    public Goods() {

    }

    public Goods(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}