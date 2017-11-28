package cn.riversky.builder.example3.directot;

import cn.riversky.builder.example3.builder.Builder;
import cn.riversky.builder.example3.struct.ExportDataModel;
import cn.riversky.builder.example3.struct.ExportFooterModel;
import cn.riversky.builder.example3.struct.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * Created by admin on 2017/11/28.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct(ExportHeaderModel headerModel, Map<String,Collection<ExportDataModel>> dataMap, ExportFooterModel footerModel){
        builder.heardBuild(headerModel);
        builder.bodyBuild(dataMap);
        builder.footerBuild(footerModel);
    }
}
