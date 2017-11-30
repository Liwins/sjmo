package cn.riversky.prototype.example2;

import cn.riversky.prototype.example2.clone.Prototype;

/**
 * Created by admin on 2017/11/30.
 */
public  class Client  {

    /**
     * 持有需要使用的原型接口对象
     */
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public void operate() {
        Prototype prototype1 = prototype.clone();
    }

}
