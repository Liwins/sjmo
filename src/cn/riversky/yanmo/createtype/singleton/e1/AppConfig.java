package cn.riversky.yanmo.createtype.singleton.e1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by admin on 2017/12/1.
 */
public class AppConfig {
    /**
     * 用来存放配置文件中参数A的值
     */
    private String parameterA;
    /**
     * 用来存放配置文件中参数B的值
     */
    private String parameterB;

    public String getParameterA() {
        return parameterA;
    }

    public String getParameterB() {
        return parameterB;
    }

    public AppConfig() {
        readConfig();
    }

    private void readConfig() {
        Properties p = new Properties();
        InputStream in = null;
        try {
            in = AppConfig.class.getResourceAsStream("appconf.properties");
            p.load(in);
            parameterA = p.getProperty("paramA");
            parameterB=p.getProperty("paramB");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
