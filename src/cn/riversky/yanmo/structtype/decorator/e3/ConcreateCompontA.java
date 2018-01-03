package cn.riversky.yanmo.structtype.decorator.e3;

/**
 * 需要被装饰的具体的类
 * Created by admin on 2017/12/8.
 */
public class ConcreateCompontA extends Component {
    @Override
    public void operation() {
        System.out.println("A base");
    }
}
