package cn.riversky.yanmo.structtype.composite.e4;

/**
 * Created by admin on 2017/12/6.
 */
public class RecursiveTest {
    public int recursive(int a){
        if(a==1){
            return 1;
        }
        return recursive(a-1)*a;
    }

    public static void main(String[] args) {
        RecursiveTest r=new RecursiveTest();
        System.out.println("3的阶乘"+r.recursive(3));
    }
}
