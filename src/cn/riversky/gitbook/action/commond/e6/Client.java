package cn.riversky.gitbook.action.commond.e6;

/**
 * 一个基于Windows平台的公告板系统，该系统提供了一个主菜单，在主菜单中包含了一些菜单项，可以通过主菜单类的addMenuItem方法
 * 添加菜单项，菜单项的主要方法是click()，每一个菜单项包含一个抽象命令类，具体命令类包括OpenCommand ,CreateCommand,EditCommand
 * 等，命令类具有一个execute方法，用于调用公告板系统据诶面类BoardScreend的open(),create(),edit()等方法。
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/6.
 */
public class Client {
    public static void main(String[] args) {
        Menu menu=new Menu();
        MeanItem meanItem1=new MeanItem("菜单项1");
        MeanItem meanItem2=new MeanItem("菜单项2");
        menu.addMeanItem(meanItem1);
        menu.addMeanItem(meanItem2);
        EditCommand editCommand=new EditCommand();
        CreateCommand createCommand=new CreateCommand();
        OpenCommand openCommand=new OpenCommand();
        meanItem1.setCommand(editCommand);
        meanItem1.click();
        meanItem1.setCommand(createCommand);
        meanItem1.click();
        meanItem1.setCommand(openCommand);
        meanItem1.click();
    }
}
