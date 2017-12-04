package cn.riversky.createtype.factorymethod.example3.creator;

import cn.riversky.createtype.factorymethod.example3.product.ExportFileApi;

/**
 * Created by admin on 2017/11/29.
 */
public class ABC {
    private String name = "";
    private ExportFileApi api = null;

    public ABC(String name,ExportFileApi api){
        this.name = name;
        this.api= api;
    }

    public void test(){
        System.out.println("name="+name);
        this.api.export("ABC");
    }
}
