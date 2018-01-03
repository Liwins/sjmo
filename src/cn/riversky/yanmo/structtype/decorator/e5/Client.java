package cn.riversky.yanmo.structtype.decorator.e5;

import java.io.*;

/**
 * 利用装饰者设计模式实现加密的输入流，进行装饰
 * @author Created by admin on 2017/12/6.
 */
public class Client {
    public static void main(String[] args) throws IOException {
       tesRead();
    }

    public static void tesRead() throws IOException {
        File file=new File("E:\\accetMyEncrypt.txt");
        DataInputStream din=new DataInputStream(new DencryptInputStream(new BufferedInputStream(new FileInputStream(file))));
        byte[] buffer=new byte[1026];
        din.read(buffer);
        System.out.println(new String(buffer));
    }
    public static void testWrite() throws IOException {
        File file=new File("E:\\accetMyEncrypt.txt");
        DataOutputStream dout=new DataOutputStream(
                new EncryptOutpusTream2(
                        new BufferedOutputStream(
                                new FileOutputStream(file)
                        )));
        dout.write("hello 你好".getBytes());
        dout.close();
    }
}
