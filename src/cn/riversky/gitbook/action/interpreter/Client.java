package cn.riversky.gitbook.action.interpreter;

/**
 * 解释器模式
 * 描述：它用于描述如何使用面向对象构成一个简单的语言解释器。在某些情况下，为了更好地描述某一些特定类型的问题。我们可以
 * 创建一种新的语言，这种语言拥有自己的表达式和结构，即文法规则，这些问题的实例将对应为该语言中的句子。
 * 定义：
 * 定义一个语言的文法，并且建立一个解释器来解释该语言中的句子，这里的语言是指使用规定格式和语法的代码。解释器模式是一种
 * 类行为型模式。
 * 角色：
 * 抽象表达式（AbstractExpression）：在抽象表达式中声明了抽象的解释操作，它是所有终结表达式和非终结符表达式的公共父类。
 * 终结符表达式（TerminalExpression）：终结符表达式是抽象表达式的子类，它实现了与文法中的终结符相关联的解释操作，在句子
 * 中的每一个终结符都是该类的一个实例。通常在一个解释器模式中只有少数几个终结符表达式类，它们的实例可以通过非终结符表达式组成
 * 较为复杂的句子。
 * 非终结符表达式（NoterminalExpresiion）：非终结符表达式也是抽象表达式的子类，他实现了文法中的非终结符的解释操作，由于在
 * 非终结表达式中可以包含终结表达式，也可以包含非中介表达式，因此其解释操作一般通过递归的方式来完成。
 * 环境类（Context）：环境类又称为上下文类，它用于存储解释器之外的一些全局信息，通常它临时存储了需要解释的语句。
 *
 * 常见应用；正则表达式，XML文档解释。
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {

    }
}