package cn.riversky.yanmo.actiontype.mediator.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/2.
 */
public class VideoCard extends BaseColleague {

    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 显示视频数据
     * @param data 被显示的数据
     */
    public void showData(String data){
        System.out.println("您正观看的是："+data);
    }
}
