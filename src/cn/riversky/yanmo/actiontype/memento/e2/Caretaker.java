package cn.riversky.yanmo.actiontype.memento.e2;

/**
 * 管理器
 * 负责保存备忘录的对象
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/29.
 */
public class Caretaker {
    private Memento memento=null;

    /**
     * 保存备忘录对象
     * @param memento
     */
    public void savememento(Memento memento){
        this.memento=memento;
    }

    /**
     * 获取备忘录对象
     * @return
     */
    public Memento retriveMemento(){
        return this.memento;
    }
}
