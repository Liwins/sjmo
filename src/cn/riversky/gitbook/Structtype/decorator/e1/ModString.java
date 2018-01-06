package cn.riversky.gitbook.Structtype.decorator.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public class ModString extends Decorator {
    public ModString(Encycle encycle) {
        super(encycle);
    }

    @Override
    public String encode(String data) {
        StringBuffer sb=new StringBuffer();
        for(char da:data.toCharArray()){
            sb.append((char) (da%110));
        }
        return sb.toString();
    }
}
