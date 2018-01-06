package cn.riversky.gitbook.Structtype.decorator.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public class InverseString extends Decorator {

    public InverseString(Encycle encycle) {
        super(encycle);
    }

    @Override
    public String encode(String data) {
        StringBuffer sb=new StringBuffer();
        char[] datachar=data.toCharArray();
        for(int i=datachar.length-1;i>=0;i--){
            sb.append(datachar[i]);
        }
        return sb.toString();
    }
}
