package cn.riversky.yanmo.actiontype.state.e5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class TestDB {
    public static Map<String,String> map=new HashMap<>();
    static {
        ScheduledExecutorService executorService= Executors.newScheduledThreadPool(2);
        executorService.scheduleAtFixedRate(new MemoryDB(),0,1000, TimeUnit.MILLISECONDS);
        Thread t= new Thread(new MemoryDB());
        t.start();
    }
    private static class MemoryDB implements Runnable{

        @Override
        public void run() {
            if(map.size()>0){
                System.out.println(map.toString());
            }else {

                System.out.println("hello 没有数据");
            }
        }
    }
}
