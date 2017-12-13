package cn.riversky.structtype.decorator.e3.decor;

import cn.riversky.structtype.decorator.e3.Component;

/**
 * 感觉实现了AOP的一部分功能，增强了功能
 * Created by admin on 2017/12/8.
 */
public class DecoratorB extends Decorator {
    public DecoratorB(Component component) {
        super(component);
    }
    /**
     * 需要添加的职责
     */
    private void addedBehavior() {
        //需要添加的职责实现
        System.out.println("数据库增强");
    }
    public void operation() {
        //调用父类的方法，可以在调用前后执行一些附加动作
        addedBehavior();
        super.operation();
    }
}
