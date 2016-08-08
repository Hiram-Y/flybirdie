package data;


import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by Jacobow on 2016/6/15.
 * 提交的申请数据
 */
public class IntoBizStruct implements java.io.Serializable {

    private static final long serialVersionUID = -9028010261423612366L;

    private Long id;                                                    // 本地id
    private Integer status;                                             // 状态            -1 无效; 0 有效; 1 已进件
    private Date createTime;                                            // 创建时间
    private String sessionToken;                                        // 会话token
    private Date doneTime;                                              // 进件时间

    private String userId;                                              // 用户id
    private String customerId;                                          // 客户id
    private String mobile;                                              // 手机号
    private String realName;                                            // 真实姓名
    private String gender;                                              // 性别
    private String identityNo;                                          // 身份证号

    private String debitCardNo;                                         // 借记卡号
    private String bankCode;                                            // 银行行号
    private String bankName;                                            // 银行名称
    private String bankProvinceCode;                                    // 银行省code
    private String bankProvinceName;                                    // 银行省名称
    private String bankCityCode;                                        // 银行市code
    private String bankCityName;                                        // 银行市名称
    private String bankReserveMobile;                                   // 银行预留手机号
    private String bankBranchName;                                      // 开户行地址

    private List<Commodity> commodities = Collections.emptyList();      // 贷款的商品

    private Loan loan;                                                  // 用户贷款信息

    private UserBase userBase;                                          // 用户基本信息

    private List<Contacts> contacts = Collections.emptyList();          // 联系人

    private List<Mobile> mobiles = Collections.emptyList();             // 通讯录

    private String appSerialNo;                                         // app序列号
    private String applySerialNo;                                       // 申请编号
    private String contractNo;                                          // 合同编号    50位以下

    private SaleControl saleControl;                                    // 销管信息

    private String longitude;                                           // 经度

    private String latitude;                                            // 纬度

    private String fingerprint;                                         // 设备指纹

    public IntoBizStruct() {
        //
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public Date getDoneTime() {
        return doneTime;
    }

    public void setDoneTime(Date doneTime) {
        this.doneTime = doneTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    //=========================================================================

    public String getDebitCardNo() {
        return debitCardNo;
    }

    public void setDebitCardNo(String debitCardNo) {
        this.debitCardNo = debitCardNo;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankProvinceCode() {
        return bankProvinceCode;
    }

    public void setBankProvinceCode(String bankProvinceCode) {
        this.bankProvinceCode = bankProvinceCode;
    }

    public String getBankProvinceName() {
        return bankProvinceName;
    }

    public void setBankProvinceName(String bankProvinceName) {
        this.bankProvinceName = bankProvinceName;
    }

    public String getBankCityCode() {
        return bankCityCode;
    }

    public void setBankCityCode(String bankCityCode) {
        this.bankCityCode = bankCityCode;
    }

    public String getBankCityName() {
        return bankCityName;
    }

    public void setBankCityName(String bankCityName) {
        this.bankCityName = bankCityName;
    }

    public String getBankReserveMobile() {
        return bankReserveMobile;
    }

    public void setBankReserveMobile(String bankReserveMobile) {
        this.bankReserveMobile = bankReserveMobile;
    }

    //=========================================================================

    public List<Commodity> getCommodities() {
        return commodities;
    }

    public void setCommodities(List<Commodity> commodities) {
        this.commodities = commodities;
    }

    //=========================================================================


    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public UserBase getUserBase() {
        return userBase;
    }

    public void setUserBase(UserBase userBase) {
        this.userBase = userBase;
    }

    public List<Contacts> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contacts> contacts) {
        this.contacts = contacts;
    }

    public List<Mobile> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<Mobile> mobiles) {
        this.mobiles = mobiles;
    }

    public String getAppSerialNo() {
        return appSerialNo;
    }

    public void setAppSerialNo(String appSerialNo) {
        this.appSerialNo = appSerialNo;
    }

    public String getApplySerialNo() {
        return applySerialNo;
    }

    public void setApplySerialNo(String applySerialNo) {
        this.applySerialNo = applySerialNo;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public SaleControl getSaleControl() {
        return saleControl;
    }

    public void setSaleControl(SaleControl saleControl) {
        this.saleControl = saleControl;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

	@Override
	public String toString() {
		return "IntoBizStruct [id=" + id + ", status=" + status + ", createTime=" + createTime + ", sessionToken="
				+ sessionToken + ", doneTime=" + doneTime + ", userId=" + userId + ", customerId=" + customerId
				+ ", mobile=" + mobile + ", realName=" + realName + ", gender=" + gender + ", identityNo=" + identityNo
				+ ", debitCardNo=" + debitCardNo + ", bankCode=" + bankCode + ", bankName=" + bankName
				+ ", bankProvinceCode=" + bankProvinceCode + ", bankProvinceName=" + bankProvinceName
				+ ", bankCityCode=" + bankCityCode + ", bankCityName=" + bankCityName + ", bankReserveMobile="
				+ bankReserveMobile + ", bankBranchName=" + bankBranchName + ", commodities=" + commodities + ", loan="
				+ loan + ", userBase=" + userBase + ", contacts=" + contacts + ", mobiles=" + mobiles + ", appSerialNo="
				+ appSerialNo + ", applySerialNo=" + applySerialNo + ", contractNo=" + contractNo + ", saleControl="
				+ saleControl + ", longitude=" + longitude + ", latitude=" + latitude + ", fingerprint=" + fingerprint
				+ "]";
	}

   
}
