package cn.riversky.createtype.abstractfactory.example4.product;

/**
 * Created by admin on 2017/11/27.
 */
public class HyMemory implements MemoryApi {
    @Override
    public void cacheData() {
        System.out.println("现在正在使用现代内存");
    }
}
