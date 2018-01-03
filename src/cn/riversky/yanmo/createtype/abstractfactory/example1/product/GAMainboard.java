package cn.riversky.yanmo.createtype.abstractfactory.example1.product;

/**
 * Created by admin on 2017/11/27.
 */
public class GAMainboard implements MainboardApi {
    private int cpuHoles=0;

    public GAMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("技嘉主板，cpu针孔数："+cpuHoles);
    }
}
