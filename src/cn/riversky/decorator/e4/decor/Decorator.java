package cn.riversky.decorator.e4.decor;

import cn.riversky.decorator.e4.Component;

import java.util.Date;

/**
 * Created by admin on 2017/12/8.
 */
public abstract class Decorator extends Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        return component.calcPrize(user,begin,end);
    }
}
