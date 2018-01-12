package cn.riversky.gitbook.action.visitor.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/12.
 */
public class KejiAward implements Award {
    @Override
    public void visit(Student student) {
        if(student.getPaper()>2){
            System.out.println(student.getName()+"（学生）：论文"+student.getPaper()+",具备评选科研奖资格");
        }else {

            System.out.println(student.getName()+"（学生）：论文发表论文低于2篇,不具备评选科研奖资格");
        }
    }

    @Override
    public void visit(Teacher teacher) {
        if(teacher.getPaper()>10){
            System.out.println(teacher.getName()+"（教师）：论文"+teacher.getPaper()+",具备评选科研奖资格");
        }else {

            System.out.println(teacher.getName()+"（教师）：论文发表论文低于2篇,不具备评选科研奖资格");
        }
    }
}
