package cn.riversky.builder.example6.builder;

/**
 * Created by admin on 2017/11/28.
 */
public class InstranceContract {
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

    private   InstranceContract(ContractBuilder builder) {
        this.contractId = builder.contractId;
        this.personName = builder.personName;
        this.companyName = builder.companyName;
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
        this.otherData = builder.otherData;
    }
    public void someOperation(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "InstranceContract{" +
                "contractId='" + contractId + '\'' +
                ", personName='" + personName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", otherData='" + otherData + '\'' +
                '}';
    }

    public static class ContractBuilder{
        private String contractId;
        private String personName;
        private String companyName;
        private long beginDate;
        private long endDate;
        private String otherData;
        public InstranceContract build(){
           return new InstranceContract(this);
        }
        public ContractBuilder(String contractId,long beginDate,long endDate) {
            this.contractId = contractId;
            this.beginDate = beginDate;
            this.endDate = endDate;
        }

        public ContractBuilder setPersonName(String personName) {
            this.personName = personName;return this;
        }

        public ContractBuilder setCompanyName(String companyName) {
            this.companyName = companyName;return this;
        }

        public ContractBuilder setOtherData(String otherData) {
            this.otherData = otherData;return this;
        }
    }

}
