package cn.riversky.yanmo.createtype.builder.example3.builder;

import cn.riversky.yanmo.createtype.builder.example3.struct.ExportDataModel;
import cn.riversky.yanmo.createtype.builder.example3.struct.ExportFooterModel;
import cn.riversky.yanmo.createtype.builder.example3.struct.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * Created by admin on 2017/11/28.
 */
public interface Builder {
    public void heardBuild(ExportHeaderModel headerModel);
    public void footerBuild(ExportFooterModel footerModel);
    public void bodyBuild(Map<String,Collection<ExportDataModel>> dataMap);
}
