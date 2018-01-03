package cn.riversky.yanmo.createtype.builder.example6;

import cn.riversky.yanmo.createtype.builder.example6.builder.InstranceContract;

/**
 * Created by admin on 2017/11/28.
 */
public class Client {
    public static void main(String[] args) {
        //创建构建器
        InstranceContract.ContractBuilder builder = new  InstranceContract.ContractBuilder("001",12345L,67890L);
        //设置需要的数据，然后构建保险合同对象
        InstranceContract contract =
                builder
                        .setPersonName("张三")
                        .setOtherData("test")
                        .build();
        //操作保险合同对象的方法
        contract.someOperation();
    }
}
