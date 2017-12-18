package cn.riversky.actiontype.command.e5.invoker;

import cn.riversky.actiontype.command.e5.command.Command;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class MenuCommand {
    private Collection<Command> col=new ArrayList<Command>();
    public void addCommand(Command command){
        col.add(command);
    }
    public void dealMenu(){
        for (Command command:col){
            command.execute();
        }
    }
}
