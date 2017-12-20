package cn.riversky.actiontype.templatemethod.e4;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/19.
 */
public class EnhenceLoginModel extends LoginModel{
    /**
     * 密码验证问题，密码验证答案
     */
    private String question,answer;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
