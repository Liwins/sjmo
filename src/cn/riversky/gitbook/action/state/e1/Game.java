package cn.riversky.gitbook.action.state.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/11.
 */
public class Game {
    private State state,primary,secondary,professional,finalWanjia;
    protected String name;
    protected int score;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }
    public void setState(State state1){
        state=state1;
    }

    public State getState() {
        return state;
    }

    public State getPrimary() {
        return primary;
    }

    public void setPrimary(State primary) {
        this.primary = primary;
    }

    public State getProfessional() {
        return professional;
    }

    public void setProfessional(State professional) {
        this.professional = professional;
    }

    public State getFinalWanjia() {
        return finalWanjia;
    }

    public void setFinalWanjia(State finalWanjia) {
        this.finalWanjia = finalWanjia;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public State getSecondary() {
        return secondary;
    }

    public Game(String name, int score) {
        primary=new Primary();
        professional=new Professional();
        secondary=new Secondary();
        finalWanjia=new Final();
        state=primary;
        this.name=name;
        this.score=score;
    }
    public void play(){
        state.play(this);
        state.changeCards(this);
        state.doubleScore(this);
        state.peekCards(this);
    }

}
