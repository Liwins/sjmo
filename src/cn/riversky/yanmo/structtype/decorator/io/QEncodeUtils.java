package cn.riversky.yanmo.structtype.decorator.io;

/**
 * Created by admin on 2017/12/13.
 */
public class QEncodeUtils {
    public static int charNextTwo(int a){
        a=a+2;
        /**
         * 处理小写情况
         */
        if(a>=97+26){
            a=a-26;
        }
        return a;
    }
    public static int charLastTwo(int a){
        a=a-2;
        /**
         * 处理小写情况
         */
        if(a<97-2){
            a=a+26;
        }
        return a;
    }
}
