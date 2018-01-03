package cn.riversky.yanmo.structtype.proxy.e7;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *  @author Created by admin on 2017/12/12.
 */
public class OrderCglib implements MethodInterceptor{
    private Enhancer enhancer=new Enhancer();
    private static final String LANJIE="set";
    /**
     * 注意这里需要通过传入子类进行创建，创建原理字节码技术
     * @param clazz
     * @return
     */
    public Object getProxy(Class clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result=null;
        //对set开头的方法进行拦截
        if(method.getName().startsWith(LANJIE)){
            System.out.println("set 前拦截"+objects[1]+"的操作" );
                    result=methodProxy.invokeSuper(o,objects);
            System.out.println("set 后拦截"+objects[1]+"的操作");

        }else {
             result =methodProxy.invokeSuper(o,objects);
        }
        return result;
    }
}
