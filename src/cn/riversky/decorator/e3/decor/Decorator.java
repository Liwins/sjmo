package cn.riversky.decorator.e3.decor;

import cn.riversky.decorator.e3.Component;

/**
 * 装饰这的基本抽象类，用来提供默认的操作功能，其实现类实现增强的功能。
 * Created by admin on 2017/12/8.
 */
public abstract class Decorator extends Component{
    private  Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    /**
     * 示例方法
     */
    public  void operation(){
        component.operation();
    }
}
