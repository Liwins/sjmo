package cn.riversky.yanmo.createtype.abstractfactory.example1.product;

/**
 * Created by admin on 2017/11/27.
 */
public class IntelCPU implements CPUApi {
    /**
     * CPU的针脚数目
     */
    private int pins = 0;
    /**
     * 构造方法，传入CPU的针脚数目
     * @param pins CPU的针脚数目
     */
    public IntelCPU(int pins){
        this.pins = pins;
    }


    @Override
    public void calculate() {
        System.out.println("Inter pin:"+pins);
    }
}
