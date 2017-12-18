package cn.riversky.actiontype.command.e5.invoker;

import cn.riversky.actiontype.command.e5.command.ChopCommand;
import cn.riversky.actiontype.command.e5.command.Command;
import cn.riversky.actiontype.command.e5.command.DuckCommand;
import cn.riversky.actiontype.command.e5.command.PorkCommand;
import cn.riversky.actiontype.command.e5.receive.CookApi;
import cn.riversky.actiontype.command.e5.receive.CoolCook;
import cn.riversky.actiontype.command.e5.receive.HotCook;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class Waiter {
    /**
     * 持有一个宏命令对象——菜单
     */
    private MenuCommand menuCommand = new MenuCommand();
    public void orderDish(Command command){
        CookApi cookHot=new HotCook();
        CookApi cookCool=new CoolCook();
        if(command instanceof DuckCommand){
            ((DuckCommand)command).setCookApi(cookHot);
        }else if(command instanceof PorkCommand){
            ((PorkCommand)command).setCookApi(cookCool);
        }else if(command instanceof ChopCommand){
            ((ChopCommand)command).setCookApi(cookHot);
        }
        menuCommand.addCommand(command);
    }
    public void dealOrder(){
        menuCommand.dealMenu();
    }
}
