package javeSE.fanxing;

/**
 * @Classname ItHuman
 * @Description TODO    程序员
 * @Date 2020/9/28 14:34
 * @Created by hmb.java.boy
 */
public class ItHuman extends Employee {
    public String getPopularity() {
        return popularity;
    }


    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    /** 人气 */
    private String popularity;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ItHuman() {
    }

    public ItHuman(String popularity,String gender) {
        this.popularity = popularity;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ItHuman{" +
                "popularity='" + popularity + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}