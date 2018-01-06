package cn.riversky.gitbook.Structtype.facade;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/5.
 */
public class NewChipherMathine {
    public String encrypt(String plainText){
        System.out.println("数据加密，铭文转换为密文。");
        //设置密钥，移位为10
        int key=10;
        StringBuffer sb=new StringBuffer();
        for (char ch:plainText.toCharArray()){
            int temp=ch+key;
            if(ch>='a'&&ch<='z'){
                if(temp>122){
                    temp-=26;
                }
                if(temp<97){
                    temp+=26;
                }
            }
            if(ch>='A'&&ch<='Z'){
                if(temp>90){
                    temp-=26;
                }
                if(temp<65){
                    temp+=26;
                }
            }
            sb.append((char) temp);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new NewChipherMathine().encrypt("aAlZz"));
    }
}
