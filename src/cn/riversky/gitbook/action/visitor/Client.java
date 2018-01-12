package cn.riversky.gitbook.action.visitor;

/**
 * 访问者模式
 * 在软件开发中，有时候我么要处理一些集合对象结构，在该结构中存储了多个不同类型的对象信息，而且对统一对象中元素的操作方式并不唯一，
 * 可能需要提供多种不同的处理方式，还有可能增加新的处理方式。在设计模式中，访问者模式就是以不同的方式操作复杂对象结构的。
 * 访问者模式，包含访问者和被访问元素两个主要组成部分，这些被访问的元素通常具有不同的类型，且不同的访问者可以对它们进行不同的访问操作
 * 在使用访问者模式时，被访问元素通常不是单独存在的，它们存储在一个集合中，这个集合被称为“对象结构”，访问者通过遍历对象结构实现对其中
 * 存储的元素的逐个操作
 * 定义：
 * 提供一个作用于某对象结构中的各元素的操作表示，它使我们可以在不改变各元素的类的前提下定义作用于这些元素的新操作。
 *
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/12.
 */
public class Client {
}
