package cn.riversky.gitbook.action.visitor.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/12.
 */
public interface Award {
    void visit(Student student);
    void visit(Teacher teacher);
}
