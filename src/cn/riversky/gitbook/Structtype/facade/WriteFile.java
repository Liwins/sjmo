package cn.riversky.gitbook.Structtype.facade;

import java.io.*;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/5.
 */
public class WriteFile {
    public boolean write(String dst,String txt) throws FileNotFoundException {
        FileOutputStream fos=new FileOutputStream( new File(dst));
        try {
            fos.write(txt.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        new WriteFile().write("d:1.txt","你好.hello");
    }
}
