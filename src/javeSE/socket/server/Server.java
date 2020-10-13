package javeSE.socket.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Classname Server
 * @Description TODO 服务端接收数据
 * @Date 2020/10/13 9:49
 * @Created by hmb.java.boy
 */
public class Server {
    public static void main(String[] args) throws IOException {
        /** 服务端需要server socket开放本地端口 */
        ServerSocket serverSocket = new ServerSocket(10086);
        /** 需要接受服务端传输过来的数据 */
        Socket accept = serverSocket.accept();
        /** 通过输入流接收客户端的数据 */
        InputStream inputStream = accept.getInputStream();
        /** 包装流进行包装 */
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        /** 读取对应数据 */
        String s = dataInputStream.readUTF();
        System.out.println(s);
        /** 关闭流操作 */
        dataInputStream.close();
        inputStream.close();
        serverSocket.close();
    }
}