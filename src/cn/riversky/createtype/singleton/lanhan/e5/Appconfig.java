package cn.riversky.createtype.singleton.lanhan.e5;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by admin on 2017/12/1.
 */
public class Appconfig {
    private static Appconfig appconfig=null;
    private String user;
    private String password;

    public static synchronized Appconfig getInstance(){
        if(appconfig==null){
            appconfig=new Appconfig();
        }
        return appconfig;
    }
    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    private Appconfig() {
    readConfig();
    }

    private void readConfig() {
        Properties properties=new Properties();
        InputStream in=null;
        try {
            in =Appconfig.class.getResourceAsStream("appconf.properties");
            properties.load(in);
            user=properties.getProperty("user");
            password=properties.getProperty("passoword");
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
