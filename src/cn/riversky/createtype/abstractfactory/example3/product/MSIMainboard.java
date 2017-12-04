package cn.riversky.createtype.abstractfactory.example3.product;

/**
 * Created by admin on 2017/11/27.
 */
public class MSIMainboard implements MainboardApi {
    private int cpuHoles=0;

    public MSIMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("微星主板，cpu针孔数："+cpuHoles);
    }
}
