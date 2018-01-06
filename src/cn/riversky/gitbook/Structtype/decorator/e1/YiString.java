package cn.riversky.gitbook.Structtype.decorator.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public class YiString extends Decorator{

    public YiString(Encycle encycle) {
        super(encycle);
    }

    @Override
    public String encode(String data) {
        StringBuilder sb=new StringBuilder();
        for(char d:data.toCharArray()){
            sb.append((char)((d+3)%122));
        }
        return sb.toString();
    }
}
