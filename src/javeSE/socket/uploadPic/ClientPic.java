package javeSE.socket.uploadPic;

import javeSE.socket.cilent.Client;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Classname Cilent
 * @Description TODO
 * @Date 2020/10/13 16:09
 * @Created by hmb.java.boy
 */
public class ClientPic {
    public static void main(String[] args) throws IOException {
        /** 创建图片输入流对象 */
        FileInputStream fileInputStream = new FileInputStream("kobe.jpeg");
        /** 创建socket对象 */
        Socket cilents = new Socket("localhost", 9963);
        /** 获取输出流对象 */
        OutputStream outputStream = cilents.getOutputStream();
        int len=0;
        while ((len=fileInputStream.read())!=-1){
            outputStream.write(len);
        }
        /** 注意：必须关闭，否则浪费资源，并发量大导致内存爆掉 */
        cilents.shutdownOutput();
        //-----------------------------获取服务端消息------------------------------
        InputStream inputStream = cilents.getInputStream();
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        System.out.println(new String(bytes,0,read));
        /** 注意：必须关闭，否则浪费资源，并发量大导致内存爆掉 */
        cilents.shutdownInput();
        /** 关闭操作 */
        inputStream.close();
        outputStream.close();
        fileInputStream.close();
        cilents.close();
    }
}