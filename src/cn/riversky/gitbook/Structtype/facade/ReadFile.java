package cn.riversky.gitbook.Structtype.facade;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/5.
 */
public class ReadFile {
    public String read(String src) throws IOException {
        BufferedInputStream reader=new BufferedInputStream(new FileInputStream(new File(src)));
        StringBuffer sb=new StringBuffer();
        byte[] buf=new byte[1024];
        while (reader.read(buf)>0){
            String temp=new String(buf,Charset.forName("UTF-8"));
            sb.append(temp);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new ReadFile().read("D:\\offi\\office2016激活\\使用说明.txt"));
    }
}
