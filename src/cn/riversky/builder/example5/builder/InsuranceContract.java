package cn.riversky.builder.example5.builder;

/**
 * Created by admin on 2017/11/28.
 */
public class InsuranceContract {
    /**
     * 保险合同编号
     */
    private String contractId;
    /**
     * 被保险人员的名称，同一份保险合同，要么跟人员签订，要么跟公司签订，
     * 也就是说，"被保险人员"和"被保险公司"这两个属性，不可能同时有值
     */
    private String personName;
    /**
     * 被保险公司的名称
     */
    private String companyName;
    /**
     * 保险开始生效的日期
     */
    private long beginDate;
    /**
     * 保险失效的日期，一定会大于保险开始生效的日期
     */
    private long endDate;
    /**
     * 示例：其它数据
     */
    private String otherData;

     InsuranceContract(ConcreteBuilder builder) {
         this.contractId= builder.getContractId();
         this.personName = builder.getPersonName();
         this.companyName = builder.getCompanyName();
         this.beginDate = builder.getBeginDate();
         this.endDate = builder.getEndDate();
         this.otherData = builder.getOtherData();
    }
    /**
     * 示意：保险合同的某些操作
     */
    public void someOperation(){
        System.out.println("合同信息"+toString());
    }

    @Override
    public String toString() {
        return "InsuranceContract{" +
                "contractId='" + contractId + '\'' +
                ", personName='" + personName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", otherData='" + otherData + '\'' +
                '}';
    }
}