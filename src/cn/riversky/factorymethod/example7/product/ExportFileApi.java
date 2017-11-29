package cn.riversky.factorymethod.example7.product;

/**
 * 导出的文件对象的接口
 * Created by admin on 2017/11/29.
 */
public interface ExportFileApi {
    /**
     * 导出内容成为文件
     * @param data 示意：需要保存的数据
     * @return 是否导出成功
     */
    public boolean export(String data);
}
