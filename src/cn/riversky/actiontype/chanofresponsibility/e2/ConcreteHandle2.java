package cn.riversky.actiontype.chanofresponsibility.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public class ConcreteHandle2 extends Handle {
    @Override
    public void handle() {
        boolean panduan=true;
        if(panduan){
            System.out.println("Concretehandle2 handle");
        }else {
            /**
             * 这里是职责传递的关键
             */
           if(this.handle!=null){
               this.handle.handle();
           }
        }
    }
}
