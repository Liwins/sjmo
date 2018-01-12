package cn.riversky.gitbook.action.mediator.e1;

/**
 * sunny软件公司欲开发一套图形界面类库。该类库需要包含若干预定义的窗格（panel）对象，例如TextPane,ListPane,GraphicPane等
 * 窗格之间不允许直接引用。基于该类库的应用由一个包含一组窗格的窗口window组成,窗口需要协调窗格之间的行为。
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/9.
 */
public class Client {
    public static void main(String[] args) {
        TextPane textPane=new TextPane();
        ListPane listPane=new ListPane();
        GraphicPane graphicPane=new GraphicPane();
        WindowChuang windowChuang=new WindowChuang(textPane,listPane,graphicPane);
        textPane.setWindowChuang(windowChuang);
        listPane.setWindowChuang(windowChuang);
        graphicPane.setWindowChuang(windowChuang);
        /**
         * 图改变（可以在windoChuang中进行其他操作）
         */
        graphicPane.update();
    }
}
