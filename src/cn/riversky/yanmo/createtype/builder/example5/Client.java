package cn.riversky.yanmo.createtype.builder.example5;

import cn.riversky.yanmo.createtype.builder.example5.builder.ConcreteBuilder;
import cn.riversky.yanmo.createtype.builder.example5.builder.InsuranceContract;

import java.util.Date;

/**
 * 结构优化，看清楚builder模式的本质
 * ：就是将器创建过程的细节交给builder进行，进行完成过程后，在使用本类进行接管使用。
 * 在创建过程中关键的异步就是build
 * 附加功能：builder的product的校验
 * Created by admin on 2017/11/28.
 */
public class Client  {
    public static void main(String[] args) {
        ConcreteBuilder builder=new ConcreteBuilder("001",new Date().getTime(),6789L);
        InsuranceContract contract=builder.setPersonName("张三").setOtherData("test").build();
        contract.someOperation();
        //操作保险合同对象的方法

        ConcreteBuilder builder2 = new ConcreteBuilder("001",12345L,67890L);
        InsuranceContract contract2 =
                builder2
                        .setPersonName("李四")
                        .setCompanyName("cc")
                        .setOtherData("company")
                        .build();
        contract2.someOperation();
    }
}
