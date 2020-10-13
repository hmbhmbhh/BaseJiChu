package javeSE.socket.cilent;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Classname Client1
 * @Description TODO
 * @Date 2020/10/13 11:02
 * @Created by hmb.java.boy
 */
public class Client1 {
    public static void main(String[] args) throws IOException {
        /** 创建socket对象，其实是实现io的虚拟端口，需要指定接收方的ip地址与端口 */
        Socket socketClient = new Socket("localhost", 10001);
        /** 获取输出流对象 */
        OutputStream outputStream = socketClient.getOutputStream();
        /** 数据输出 */
        outputStream.write("hello，client1".getBytes());
        //-------------------------接收服务端返回的消息---------------------------------------
        /** 获取输入流对象 */
        InputStream inputStream = socketClient.getInputStream();
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        System.out.println("服务端响应的数据：" + new String(bytes, 0, read));
        /** 关闭流 */
        inputStream.close();
        outputStream.close();
        socketClient.close();
    }
}