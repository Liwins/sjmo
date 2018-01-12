package cn.riversky.gitbook.action.mediator.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/9.
 */
public class TextPane extends Panel {
    WindowChuang windowChuang;
    public void setWindowChuang(WindowChuang windowChuang){
        this.windowChuang=windowChuang;
    }

    public void update(){
        System.out.println("TextPane更新");
        windowChuang.panelChange(this);
    }
}
