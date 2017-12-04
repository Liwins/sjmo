package cn.riversky.createtype.singleton.mutithread;

import java.util.Random;

/**
 * 对于懒汉室存在线程安全问题
 * Created by admin on 2017/12/1.
 */
public class ThreadSingleton implements Runnable{
    private static ThreadSingleton instance=null;

    private ThreadSingleton() {

        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
    }
    public static ThreadSingleton getInstance(){
        if(instance==null){
            try {
                Thread.sleep(new Random().nextInt(1992));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            synchronized (ThreadSingleton.class){
                instance=new ThreadSingleton();
//            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 122; i++) {
            new Thread(instance).start();
        }
    }

    @Override
    public void run() {
        System.out.println(ThreadSingleton.getInstance());
//        System.out.println(instance);
    }
}
