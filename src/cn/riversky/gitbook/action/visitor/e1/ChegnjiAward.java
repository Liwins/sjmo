package cn.riversky.gitbook.action.visitor.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/12.
 */
public class ChegnjiAward implements Award {
    @Override
    public void visit(Student student) {
        if(student.getScore()>90){
            System.out.println(student.getName()+"（学生）：成绩"+student.getScore()+",具备评选优秀奖资格");
        }else {
            System.out.println(student.getName()+"（学生）：成绩不足90分,不具备评选优秀奖资格");
        }
    }

    @Override
    public void visit(Teacher teacher) {
        if(teacher.getScore()>90){
            System.out.println(teacher.getName()+"（教师）：成绩"+teacher.getScore()+",具备评选优秀奖资格");
        }else {
            System.out.println(teacher.getName()+"（教师）：成绩不足90分,不具备评选优秀奖资格");
        }
    }
}
