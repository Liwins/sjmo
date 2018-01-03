package cn.riversky.yanmo.createtype.singleton.ehan.e4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by admin on 2017/12/1.
 */
public class Singleton {
    private static Singleton uniqueInstance=new Singleton();
    private String paramA;
    private String paramB;

    public static Singleton getUniqueInstance() {
        return uniqueInstance;
    }

    public String getParamA() {
        return paramA;
    }

    public String getParamB() {
        return paramB;
    }

    private Singleton() {
        readConfig();
    }

    private void readConfig() {
        Properties p=new Properties();
        InputStream in=null;
        try {
            in =Singleton.class.getResourceAsStream("appconf.properties");
            p.load(in);
            paramA=p.getProperty("user");
            paramB=p.getProperty("passoword");
        }catch (Exception e){
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
