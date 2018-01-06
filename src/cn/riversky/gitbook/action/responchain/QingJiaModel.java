package cn.riversky.gitbook.action.responchain;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/6.
 */
public class QingJiaModel {
    private String name;
    private int day;
    private String descript;

    public QingJiaModel() {
    }

    public QingJiaModel(String name, int day, String descript) {
        this.name = name;
        this.day = day;
        this.descript = descript;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }
}

