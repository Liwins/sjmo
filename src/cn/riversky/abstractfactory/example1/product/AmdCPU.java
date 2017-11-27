package cn.riversky.abstractfactory.example1.product;

/**
 * Created by admin on 2017/11/27.
 */
public class AmdCPU implements CPUApi {
    /**
     * CPU的针脚数目
     */
    private int pins = 0;
    /**
     * 构造方法，传入CPU的针脚数目
     * @param pins CPU的针脚数目
     */
    public AmdCPU(int pins){
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("AMDcpu pin:"+pins);
    }
}
