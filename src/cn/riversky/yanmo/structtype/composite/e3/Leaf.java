package cn.riversky.yanmo.structtype.composite.e3;

/**
 * Created by admin on 2017/12/6.
 */
public class Leaf extends Component {
    /**
     * 叶子对象可能有自己的功能方法
     */
    private String name="";

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void printStr(String prefix) {
        System.out.println(prefix+"-"+name);
    }
}
