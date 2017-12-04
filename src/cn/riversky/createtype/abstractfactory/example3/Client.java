package cn.riversky.createtype.abstractfactory.example3;


import cn.riversky.createtype.abstractfactory.example3.factory.Type2;

/**
 * Created by admin on 2017/11/27.
 */
public class Client {
    public static void main(String[] args) {
        Computer computer=new Computer();
//        computer.makeComputer(new Type1());
        computer.makeComputer(new Type2());
    }
}

