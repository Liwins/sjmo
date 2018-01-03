package cn.riversky.yanmo.actiontype.mediator.e3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/2.
 */
public class DepUserMediatorImpl {
    /**
     * 使用单例模式对该中介者进行实例的生成
     */
    private static DepUserMediatorImpl mediator=new DepUserMediatorImpl();

    private DepUserMediatorImpl() {
        //生成测试数据
        intiTestData();
    }
    public static DepUserMediatorImpl getInstance(){
        return mediator;
    }

    /**
     * 测试中的关系表数据
     */
    private Collection<DepUserModel> depUserCol=new ArrayList<>();

    /**
     * 初始化测试数据
     */
    private void intiTestData() {
        depUserCol.add(new DepUserModel("du1","d1","u1"));
        depUserCol.add(new DepUserModel("du2","d1","u2"));
        depUserCol.add(new DepUserModel("du3","d2","u3"));
        depUserCol.add(new DepUserModel("du4","d2","u4"));
        depUserCol.add(new DepUserModel("du5","d1","u5"));
    }
    /**
     * 完成因撤销部门的操作所引起的与人员的交互，需要去除相应的关系
     * @param depId 被撤销的部门对象的编号
     * @return 是否已经正确的处理了因撤销部门所引起的与人员的交互
     */
    public boolean deleteDep(String depId) {
        //请注意：为了演示简单，部门撤销后，原部门的人员怎么处理等后续业务处理，这里就不管了

        //1：到记录部门和人员关系的集合里面，寻找跟这个部门相关的人员
        //设置一个临时的集合，记录需要清除的关系对象
        Collection<DepUserModel> tempCol=new ArrayList<>();
        for(DepUserModel du:depUserCol){
            if(du.getDepId().equals(depId)){
                //2记录下来要删除的记录
                tempCol.add(du);
            }
        }
        //3从关系集合中清除掉这些关系
        depUserCol.removeAll(tempCol);
        return  true;
    }
    /**
     * 完成因人员离职引起的与部门的交互
     * @param userId 离职的人员的编号
     * @return 是否正确处理了因人员离职引起的与部门的交互
     */
    public boolean deleteUser(String userId) {
        //1：到记录部门和人员关系的集合里面，寻找跟这个人员相关的部门
        //设置一个临时的集合，记录需要清除的关系对象
        Collection<DepUserModel> tempCol = new ArrayList<DepUserModel>();
        for(DepUserModel du : depUserCol){
            if(du.getUserId().equals(userId)){
                //2：需要把这个相关的记录去掉，先记录下来
                tempCol.add(du);
            }
        }
        //3：从关系集合里面清除掉这些关系
        depUserCol.removeAll(tempCol);

        return true;
    }
    /**
     * 测试用，在内部打印显示一下一个部门下的所有人员
     * @param dep 部门对象
     */
    public void showDepUsers(Dep dep) {
        for(DepUserModel du : depUserCol){
            if(du.getDepId().equals(dep.getDepId())){
                System.out.println("部门编号="+dep.getDepId()+"下面拥有人员，其编号是："+du.getUserId());
            }
        }
    }
    /**
     * 测试用，在内部打印显示一下一个人员所属的部门
     * @param user 人员对象
     */
    public void showUserDeps(User user) {
        for(DepUserModel du : depUserCol){
            if(du.getUserId().equals(user.getUserId())){
                System.out.println("人员编号="+user.getUserId()+"属于部门编号是："+du.getDepId());
            }
        }
    }
}
