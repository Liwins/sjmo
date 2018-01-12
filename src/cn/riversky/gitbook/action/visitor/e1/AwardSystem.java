package cn.riversky.gitbook.action.visitor.e1;

import java.util.ArrayList;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/12.
 */
public class AwardSystem {
    private ArrayList<SchoolBase> schoolBases;

    public AwardSystem() {
        this.schoolBases = new ArrayList<>();
    }
    public void addPerson(SchoolBase schoolBase){
        schoolBases.add(schoolBase);
    }
    public void acces(Award award){
        for (SchoolBase schoolBase:schoolBases){
            schoolBase.accept(award);
        }
    }
}
