package cn.riversky.yanmo.actiontype.mediator.e2;


/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/2.
 */
public class MainBoard implements Mediator {
    /**
     * 需要知道要交互的同事类——光驱类
     */
    private CDDriver cdDriver = null;
    /**
     * 需要知道要交互的同事类——CPU类
     */
    private CPU cpu = null;
    /**
     * 需要知道要交互的同事类——显卡类
     */
    private VideoCard videoCard = null;
    /**
     * 需要知道要交互的同事类——声卡类
     */
    private SoundCard soundCard = null;

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    @Override
    public void changed(BaseColleague colleague) {
        if(colleague==cdDriver){
            //表示读取光驱结束了
            openCDDriverReadData( cdDriver);
        }else if(colleague==cpu){
            openCPU(cpu);
        }
    }

    /**
     * 处理光驱读取数据过后与其他对象进行交互
     * @param cd 光驱同事对象
     */
    private void openCDDriverReadData(CDDriver cd){
        String data=cd.getData();
        cpu.executeData(data);
    }
    private void openCPU(CPU cpu){
        String videoData=cpu.getVideoData();
        String soundData=cpu.getSoundData();

        videoCard.showData(videoData);
        soundCard.soundData(soundData);
    }

}
