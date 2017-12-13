package cn.riversky.structtype.decorator.e4;

import java.util.Date;

/**
 * Created by admin on 2017/12/8.
 */
public class ConcreteComponent extends Component {
    @Override
    public double calcPrize(String user, Date begin, Date end) {
        return 0;
    }
}
