package cn.riversky.gitbook.action.template;

/**
 * 模板流程，获取数据，转换数据，显示数据
 *
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/11.
 */
public abstract class Viewer {
    private String data;
    public void handle(){
        getData();
        data=converData(data);
        printData();
    }
    public  void getData(){
        this.data="基本数据";
        System.out.println(data);
    }
    abstract String converData(String data);
    public void printData(){
        System.out.println("打印数据："+data);
    }
}
