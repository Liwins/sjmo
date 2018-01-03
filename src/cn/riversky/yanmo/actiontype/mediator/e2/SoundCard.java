package cn.riversky.yanmo.actiontype.mediator.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/2.
 */
public class SoundCard extends BaseColleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 按照声频数据发出声音
     * @param data
     */
    public void soundData(String data){
        System.out.println("画外音："+data);
    }
}
