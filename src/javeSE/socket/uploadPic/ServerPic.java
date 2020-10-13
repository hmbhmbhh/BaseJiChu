package javeSE.socket.uploadPic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Classname Server
 * @Description TODO
 * @Date 2020/10/13 17:08
 * @Created by hmb.java.boy
 */
public class ServerPic {
    public static void main(String[] args) throws IOException {
        /** 开放端口 */
        ServerSocket serverSocket = new ServerSocket(9963);
        /** 接受数据 */
        Socket accept = serverSocket.accept();
        /** 获取流数据 */
        InputStream inputStream = accept.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream("forver-kobe.jpeg");
        int tep=0;
        while((tep=inputStream.read())!=-1){
            fileOutputStream.write(tep);
        }
        /** 注意：必须关闭，否则浪费资源，并发量大导致内存爆掉 */
        accept.shutdownInput();
        /** 基于客户端回复消息 */
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("上传成功".getBytes());
        /** 注意：必须关闭，否则浪费资源，并发量大导致内存爆掉 */
        accept.shutdownOutput();
        /** 关闭流操作 */
        outputStream.close();
        fileOutputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();

    }
}