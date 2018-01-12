package cn.riversky.gitbook.action.iterator.e1;

import java.util.List;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/9.
 */
public class ItemIterator implements AbstractIteractor {
    AbstractObjectList pageList;
    List pages;

    public ItemIterator(AbstractObjectList pageList) {
        this.pageList = pageList;
        pages=pageList.getObjects();
        cursor1=0;
        cursor2=pages.size()-1;
    }
    private int cursor1;
    private int cursor2;
    @Override
    public void next() {
        if(cursor1<pages.size()){
            cursor1++;
        }
    }

    @Override
    public boolean isLast() {
        return (cursor1==pages.size());
    }

    @Override
    public void previous() {
        if(cursor2>-1){
            cursor2--;
        }
    }

    @Override
    public boolean isFirst() {
        return (cursor2==-1);
    }

    @Override
    public Object getNext() {
        return pages.get(cursor1);
    }

    @Override
    public Object getPreviousItem() {
        return pages.get(cursor2);
    }
}
