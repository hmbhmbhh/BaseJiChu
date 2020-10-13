package javeSE.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Classname SocketDemo
 * @Description TODO sock编程
 * @Date 2020/10/12 10:19
 * @Created by hmb.java.boy
 */
public class SocketDemo {
    public static void main(String[] args) throws UnknownHostException {
        /** 获取本机IP */
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName);



    }
}