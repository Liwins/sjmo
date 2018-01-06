package cn.riversky.gitbook.action.commond.e6;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/6.
 */
public class MeanItem {
    private String name;
    private Command command;

    public MeanItem(String name) {
        this.name = name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public String getName() {
        return name;
    }
    public void click(){
        command.execute();
    }
}
