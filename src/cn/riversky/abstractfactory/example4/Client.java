package cn.riversky.abstractfactory.example4;


import cn.riversky.abstractfactory.example4.factory.Type3;

/**
 *
 * 这种方式在进行复用的时候前端不需要进行改变，
 */
public class Client {
    public static void main(String[] args) {
        Computer computer=new Computer();
//        computer.makeAcomputer(new Type1());
        computer.makeAcomputer(new Type3());
    }
}

