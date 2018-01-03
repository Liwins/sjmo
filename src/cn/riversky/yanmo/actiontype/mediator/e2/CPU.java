package cn.riversky.yanmo.actiontype.mediator.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/2.
 */
public class CPU extends BaseColleague {
    public CPU(Mediator mediator) {
        super(mediator);
    }

    /**
     * 分解出来的视频数据
     */
    private String videoData="";
    /**
     * 分解出来的声音数据
     */
    private String soundData="";

    public String getVideoData() {
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    /**
     * 使用拉模型将自身的数据发布出去
     * @param data
     */
    public void executeData(String data){
        String []ss=data.split(",");
        videoData=ss[0];
        soundData=ss[1];
        this.getMediator().changed(this);
    }

}
