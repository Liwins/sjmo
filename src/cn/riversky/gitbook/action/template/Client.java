package cn.riversky.gitbook.action.template;

/**
 * 模版方法
 * 定义：定义一个操作中的算法框架，而将一些步骤延迟到子类中。模版方法模式使得子类可以不改变一个算法的结构即可重定义该算法的某些
 * 特定步骤。是一种基于继承的代码复用技术，它是一种类行为性模式
 * 模板方法模式是结构最简单的行为型设计模式，在其结构中只存在父类和子类之间的继承关系。通过使用模板方法模式，可以使一些复杂流程的实现
 * 步骤封装在一系列基本方法中，在抽象父类中提供一个称之为模板方法的方法来定义这些基本方法的执行次序，而通过其子类来覆盖某些步骤，从而
 * 使得相同的算法框架可以有不同的执行结果。模板方法模式提供了一个模板方法来定义算法框架，而某些具体步骤的实现可以在其子类中完成。
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/11.
 */
public class Client {
    public static void main(String[] args) {
        Viewer viewer=new DocViewwe();
        viewer.handle();
        viewer=new XmlViewwe();
        viewer.handle();
    }
}
