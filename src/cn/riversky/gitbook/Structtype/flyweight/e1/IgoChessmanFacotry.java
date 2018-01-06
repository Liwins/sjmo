package cn.riversky.gitbook.Structtype.flyweight.e1;

import java.util.Hashtable;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/5.
 */
public class IgoChessmanFacotry {
    private static IgoChessmanFacotry igoChessmanFacotry;
    private static Hashtable<String, IgoChessman> igos;

    private IgoChessmanFacotry() {
        igos = new Hashtable<>();
        igos.put("b", new BlackGoChessman());
        igos.put("w", new WriteGoChessman());
    }

    public static IgoChessmanFacotry getInstance() {
        return new IgoChessmanFacotry();
    }

    public IgoChessman getIgoChessman(String color) {
        IgoChessman igoChessman = igos.get(color);
        return igoChessman;
    }

}
