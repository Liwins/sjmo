package cn.riversky.gitbook.action.responchain;


/**
 * 责任链模式
 * 描述：很多对象由每一个对象对其下家的引用而连接起来形成一条链。请求在这个链上传递，直到链上的某一个对象决定处理此请求
 * 发出这个请求的客户端并不知道链上的那个对象最终处理这个请求，这使得系统可以在不影响客户端的情况下动态地重新组织链和分配责任。
 * 核心：抽象处理类的设计（因为具有下一个对象的引用），作用是处理请求和转发请求
 * 分类：纯职责链模式（一个具体的处理者对象只能在两个行为中选取一个要么全部处理，要么全部转发）和不纯的指责链模式
 * 不纯的指责连模式：在一个不纯的指责连模式中允许某个请求被一个具体处理者部分处理后再向下传递，或者一个具体处理者处理完某
 * 请求后其后继处理者可以处理该请求，而且一个请求可以最终不被任何处理者对象所接收。
 * 理解：职责链模式通过建立一条链来组织请求的处理者，请求将沿着链进行传递，请求发送者无须知道请求在何时、何处以及如何被处理，实现了请求
 * 者与处理者的解耦，在软件开发中，如果遇到多个对象可以处理同一请求时可以应用职责链模式，例如在Web应用开发中通过创建过滤器filterr链来对请求数据
 * 进行过滤，在工作流系统中实现公文的分级审批等等，使用职责链模式可以较好地解决此类问题。
 *
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/6.
 */
public class Client {
    public static void main(String[] args) {
        QingJiaModel qingJiaModel1=new QingJiaModel("张三",2,"回家洗衣服");
        QingJiaModel qingJiaModel2=new QingJiaModel("张三",4,"回家处理紧急情况");
        QingJiaModel qingJiaModel3=new QingJiaModel("张三",13,"回家结婚");
        QingJiaModel qingJiaModel4=new QingJiaModel("张三",132,"出国相亲");
        ShenPi zhuRen=new ZhuRen("李洋");
        ShenPi jingli=new JingLi("陈鹏");
        ShenPi zongjingli=new ZongJingLi("小强");
        zhuRen.setShenPi(jingli);
        jingli.setShenPi(zongjingli);
        zhuRen.dealShen(qingJiaModel1);
        zhuRen.dealShen(qingJiaModel2);
        zhuRen.dealShen(qingJiaModel3);
        zhuRen.dealShen(qingJiaModel4);
    }
}
