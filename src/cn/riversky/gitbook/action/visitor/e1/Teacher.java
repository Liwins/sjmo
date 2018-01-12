package cn.riversky.gitbook.action.visitor.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/12.
 */
public class Teacher implements SchoolBase {
    private String name;
    private int paper;
    private int score;

    public Teacher() {
    }

    public Teacher(String name, int paper, int score) {
        this.name = name;
        this.paper = paper;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaper() {
        return paper;
    }

    public void setPaper(int paper) {
        this.paper = paper;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public void accept(Award award) {
        award.visit(this);
    }
}
