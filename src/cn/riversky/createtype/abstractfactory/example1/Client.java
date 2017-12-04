package cn.riversky.createtype.abstractfactory.example1;

/**
 * Created by admin on 2017/11/27.
 */
public class Client {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.makeComputer("AiMD","GA");
    }
}

