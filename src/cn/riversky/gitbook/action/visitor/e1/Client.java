package cn.riversky.gitbook.action.visitor.e1;

/**
 * Sunny软件公司欲为某高校开发一套奖励审批系统，该系统可以实现教师奖励和学生奖励的审批，如果教师发表论文数超过10篇或者学生论文
 * 超过两篇可以评选科研奖，如果教师教学反馈分大于等于90或者学生平均成绩大于等于90分可以评选成绩优秀奖。
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/12.
 */
public class Client {

    public static void main(String[] args) {
        Student student1=new Student("张峰峰",2,22);
        Student student2=new Student("张错峰",1,95);
        Student student3=new Student("李峰峰",3,22);
        Student student4=new Student("秦大",1,22);
        Student student5=new Student("陈云峰",4,22);
        Student student6=new Student("陈峰",1,92);
        Teacher teacher1=new Teacher("谢晓峰",3,22);
        Teacher teacher2=new Teacher("赵慧杰",12,22);
        Teacher teacher3=new Teacher("张丹倍",14,96);
        Teacher teacher4=new Teacher("王江",3,92);
        Teacher teacher5=new Teacher("秦淑静",13,22);
        Teacher teacher6=new Teacher("周里",32,92);
        Teacher teacher7=new Teacher("李珊珊",1,82);
        Teacher teacher8=new Teacher("李树人",7,92);
        AwardSystem awardSystem=new AwardSystem();
        awardSystem.addPerson(student1);
        awardSystem.addPerson(student2);
        awardSystem.addPerson(student3);
        awardSystem.addPerson(student4);
        awardSystem.addPerson(student5);
        awardSystem.addPerson(student6);
        awardSystem.addPerson(teacher1);
        awardSystem.addPerson(teacher2);
        awardSystem.addPerson(teacher3);
        awardSystem.addPerson(teacher4);
        awardSystem.addPerson(teacher5);
        awardSystem.addPerson(teacher6);
        awardSystem.addPerson(teacher7);
        awardSystem.addPerson(teacher8);
        awardSystem.acces(new KejiAward());
        awardSystem.acces(new ChegnjiAward());
    }
}
