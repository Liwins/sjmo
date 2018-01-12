package cn.riversky.gitbook.action.iterator.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/9.
 */
public interface AbstractIteractor {
    /**
     * 移至下一个元素
     */
    void next();

    /**
     * 判断是否为最后一个元素
     * @return
     */
    boolean isLast();

    /**
     * 移至上一个元素
     * @return
     */
    void previous();

    /**
     * 判断是否是第一个元素
     * @return
     */
    boolean isFirst();

    /**
     * 获取下一个元素
     * @return
     */
    Object getNext();

    /**
     * 获取上一个元素
     * @return
     */
    Object getPreviousItem();
}
