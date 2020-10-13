package javeSE.socket.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Classname Server1
 * @Description TODO
 * @Date 2020/10/13 11:14
 * @Created by hmb.java.boy
 */
public class Server1 {
    public static void main(String[] args) throws IOException {
        /** 开放端口 */
        ServerSocket serverSocket = new ServerSocket(10001);
        /** 接受客户端数据 */
        Socket accept = serverSocket.accept();
        /** 获取输入流对象 */
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        System.out.println("客户端传输的数据："+ new String(bytes,0,read));
        //------------------------------返回客户端的数据-----------------------------------------
        /** 获取输出流 */
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("你好，收到".getBytes());
        /** 关闭流 */
        outputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();
    }
}