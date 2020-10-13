package javeSE.socket.cilent;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Classname Cilent
 * @Description TODO 客户端发送数据
 * @Date 2020/10/13 10:13
 * @Created by hmb.java.boy
 */
public class Client {
    public static void main(String[] args) throws IOException {
        /** 创建socket对象，其实是开启实现io的虚拟端口
         *  需指定接收方的ip地址与端口
         * */
        Socket socketCilent = new Socket("localhost", 10086);
        /** 获取输出流对象 */
        OutputStream outputStream = socketCilent.getOutputStream();
        /** 包装流 */
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        /** 传输数据 */
        dataOutputStream.writeUTF("hello,socket");
        /** 关闭流操作 */
        dataOutputStream.close();
        outputStream.close();
        socketCilent.close();
    }
}