package cn.riversky.yanmo.actiontype.command.e4;

/**
 * 计算机加减设计，具有四个按钮，加，减，重做，撤销
 * invoker->CCalculator,Calculator2:两个调用类，具有四种按钮，以及对应的命令执行，（重做和撤销是建立在加减之上）
 * command:定义接口，执行 撤销
 * ConcreteCommand->SubstractCommand,AddCommand,两个实现类
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 构建操作命令，recever
         */
        OperationApi addop=new Operate();
        Command command=new AddCommand(addop,5);
        Command substractComm =new SubstractCommand(addop,3);
        /**
         * 将命令设置到invoker中
         */
        Calculator calculator=new Calculator();
        calculator.setAddCmd(command);
        calculator.setSubstractCmd(substractComm);
        /**
         * 模拟按钮，测试一下
         */
        calculator.addPress();
        System.out.println("一次加法运算后的结果为："+addop.getResult());
        calculator.substractPress();
        System.out.println("一次减法运算后的结果为："+addop.getResult());
        /**
         * 测试撤销
         */
        calculator.undoPress();
        System.out.println("一次撤销运算后的结果为："+addop.getResult());
        calculator.undoPress();
        System.out.println("2次撤销运算后的结果为："+addop.getResult());
        /**
         * 测试恢复
         */
        calculator.redoPress();
        System.out.println("一次重做运算后的结果为："+addop.getResult());
        calculator.redoPress();
        System.out.println("2次重做运算后的结果为："+addop.getResult());

    }
}
