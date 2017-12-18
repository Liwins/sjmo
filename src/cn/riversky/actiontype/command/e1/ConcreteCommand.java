package cn.riversky.actiontype.command.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class ConcreteCommand implements Command {
    private Receiver receiver=null;


    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void doCommand() {
        receiver.duAction();
    }
}
