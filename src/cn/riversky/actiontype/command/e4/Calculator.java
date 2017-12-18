package cn.riversky.actiontype.command.e4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class Calculator {
    private List<Command> undoCmds=new ArrayList<Command>();
    private List<Command> redoCmds=new ArrayList<Command>();
    private Command addCmd=null;
    private Command substractCmd=null;
    public void setAddCmd(Command addCmd) {
        this.addCmd = addCmd;
    }
    public void setSubstractCmd(Command substractCmd) {
        this.substractCmd = substractCmd;
    }
    public void addPress(){
        addCmd.execute();
        undoCmds.add(addCmd);
    }
    public void substractPress(){
        substractCmd.execute();
        undoCmds.add(substractCmd);
    }

    /**
     * 撤销操作，从取消队列取出来执行，然后放入重做队列
     */
    public void undoPress(){
        if(undoCmds.size()>0){
            Command cmd=undoCmds.get(undoCmds.size()-1);
            cmd.undo();
            redoCmds.add(cmd);
            undoCmds.remove(cmd);
        }else {
            System.out.println("很抱歉，没有可撤销的命令");
        }
    }

    /**
     * 重做操作，
     */
    public void redoPress(){
        if(redoCmds.size()>0){
            Command command=redoCmds.get(redoCmds.size()-1);
            command.execute();
            undoCmds.add(command);
            redoCmds.remove(command);
        }else {
            System.out.println("抱歉，没有可恢复的命令");
        }
    }
}
