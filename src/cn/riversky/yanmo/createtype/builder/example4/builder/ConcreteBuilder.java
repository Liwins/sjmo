package cn.riversky.yanmo.createtype.builder.example4.builder;

/**
 * Created by admin on 2017/11/28.
 */
public class ConcreteBuilder  {
    private String contractId;
    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String otherData;
    //    将InsuranceContract的创建在builder中进行
    /**
     * 构建真正的对象并返回
     * @return 构建的保险合同的对象
     */
    public InsuranceContract build(){
        return new InsuranceContract(this);
    }
    /**
     * 构造方法，传入必须要有的参数
     * @param contractId 保险合同编号
     * @param beginDate 保险开始生效的日期
     * @param endDate 保险失效的日期
     */
    public ConcreteBuilder(String contractId,long beginDate,long endDate){
        this.contractId = contractId;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    /**
     * 以下set方式都是选填写的
     * @param contractId
     */
    public ConcreteBuilder setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }

    public ConcreteBuilder setPersonName(String personName) {
        this.personName = personName;
        return this;
    }

    public ConcreteBuilder setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public ConcreteBuilder setEndDate(long endDate) {
        this.endDate = endDate;
        return this;
    }

    public ConcreteBuilder setOtherData(String otherData) {
        this.otherData = otherData;
        return this;
    }

    public String getContractId() {
        return contractId;
    }

    public String getPersonName() {
        return personName;
    }


    public String getCompanyName() {
        return companyName;
    }


    public long getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(long beginDate) {
        this.beginDate = beginDate;
    }

    public long getEndDate() {
        return endDate;
    }


    public String getOtherData() {
        return otherData;
    }

}
