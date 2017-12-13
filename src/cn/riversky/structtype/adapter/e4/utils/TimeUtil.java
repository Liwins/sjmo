package cn.riversky.adapter.e4.utils;

import java.util.Date;

/**
 * Created by admin on 2017/12/4.
 */
public class TimeUtil {
    private long t1;
    private long t2;
    public void begin(){
        t1=new Date().getTime();
    }
    public void end(){
        t2=new Date().getTime();
    }
    public void show(){
        System.out.println("timts11:"+(t2-t1));
    }
}
