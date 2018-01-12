package cn.riversky.gitbook.action.iterator.e1;

import java.util.List;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/9.
 */
public class PageList extends AbstractObjectList {
    public PageList(List<Object> objects) {
        super(objects);
    }

    @Override
    AbstractIteractor createrator() {
        return new ItemIterator(this);
    }

    @Override
    AbstractIteractor createrator1() {
        return new PageIterator(this,3);
    }

}
