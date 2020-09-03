package javeSE.basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Classname collectionDemo
 * @Description TODO
 * @Date 2020/8/31 16:28
 * @Created by hmb.java.boy
 */
public class CollectionDemo {
    public static void main(String[] args) {

        addf();
    }
    public static void addf(){
        Collection collection = new ArrayList<Object>();
        boolean empty = collection.isEmpty();
        System.out.println(empty);

    }
}