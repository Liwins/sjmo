package cn.riversky.createtype.prototype.example3;

import cn.riversky.createtype.prototype.example3.clone.OrderApi;

import java.util.ArrayList;

/**
 * 同过多生成的放到arraylist中进行存放
 * Created by admin on 2017/11/30.
 */
public class Server {
    private OrderApi orderApi;

    public Server(OrderApi orderApi) {
        this.orderApi = orderApi;
    }
    public void operate(OrderApi orderApi){
        ArrayList<OrderApi> oders=new ArrayList<>();
        while (orderApi.getOrderProductNum()>OrderApi.MAXNUM){
            OrderApi newOrder=orderApi.clone();
            oders.add(newOrder);
        }
        System.out.println("旧的order:"+orderApi);
        if(oders.size()>0){
            System.out.println("新的order："+oders);
        }
    }
}
