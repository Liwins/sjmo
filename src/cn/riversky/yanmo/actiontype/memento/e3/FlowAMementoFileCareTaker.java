package cn.riversky.yanmo.actiontype.memento.e3;

import java.io.*;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/29.
 */
public class FlowAMementoFileCareTaker {
    public void saveMemento(FlowAMockMemento memento){
        ObjectOutputStream out=null;
        try {
            out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("FlowAmemento")));
            out.writeObject(memento);
            System.out.println("now write file===========");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 获取被保存的备忘录对象
     * @return 被保存的备忘录对象
     */
    public FlowAMockMemento retriveMemento(){
        FlowAMockMemento memento=null;
        ObjectInputStream in=null;
        try {
            in=new ObjectInputStream(new BufferedInputStream(new FileInputStream("FlowAmemento")));
            memento= (FlowAMockMemento) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return memento;
    }
}
