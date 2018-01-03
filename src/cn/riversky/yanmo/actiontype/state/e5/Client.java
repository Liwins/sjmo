package cn.riversky.yanmo.actiontype.state.e5;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class Client {
    public static void main(String[] args) {
        TestDB.map.put("b","22");
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        TestDB.map.put("c","24");
    }
}
