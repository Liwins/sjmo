package cn.riversky.yanmo.createtype.builder.example5.builder;

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

        if(contractId==null || contractId.trim().length()==0){
            throw new IllegalArgumentException("合同编号不能为空");
        }
        boolean signPerson = personName!=null && personName.trim().length()>0;
        boolean signCompany = companyName!=null && companyName.trim().length()>0;
        if(signPerson && signCompany){
            throw new IllegalArgumentException("一份保险合同不能同时与人和公司签订");
        }
        if(signPerson==false && signCompany==false){
            throw new IllegalArgumentException("一份保险合同不能没有签订对象");
        }
        if(beginDate<=0){
            throw new IllegalArgumentException("合同必须有保险开始生效的日期");
        }
        if(endDate<=0){
            throw new IllegalArgumentException("合同必须有保险失效的日期");
        }
        if(endDate<=beginDate){
            throw new IllegalArgumentException("保险失效的日期必须大于保险生效日期");
        }
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
