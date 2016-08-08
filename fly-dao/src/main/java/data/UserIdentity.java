package data;


/**
 * Created by Jacobow on 2016/6/16.
 */
public class UserIdentity implements java.io.Serializable {

	private static final long serialVersionUID = -6752779191540568885L;
	// 身份信息
	private String userId;
	private String customerId;
	private String realName;
	private String gender;
	private String identityNo;
	private String mobile;
	// 默认银行卡信息
	private String debitCardNo;
	private String bankReserveMobile;
	private String bankCode;
	private String bankName;
	private Area bankProvince;
	private Area bankCity;
	private String bankBranchName;

	public UserIdentity(String userId, String customerId, String mobile, String realName, String gender,
			String identityNo, String debitCardNo, String bankReserveMobile, String bankCode, String bankName,
			Area bankProvince, Area bankCity, String bankBranchName) {
		setUserId(userId);
		setCustomerId(customerId);
		setMobile(mobile);
		setRealName(realName);
		setGender(gender);
		setIdentityNo(identityNo);
		setDebitCardNo(debitCardNo);
		setBankReserveMobile(bankReserveMobile);
		setBankCode(bankCode);
		setBankName(bankName);
		setBankProvince(bankProvince);
		setBankCity(bankCity);
		setBankBranchName(bankBranchName);
	}

	public UserIdentity() {
		//
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDebitCardNo() {
		return debitCardNo;
	}

	public void setDebitCardNo(String debitCardNo) {
		this.debitCardNo = debitCardNo;
	}

	public String getBankReserveMobile() {
		return bankReserveMobile;
	}

	public void setBankReserveMobile(String bankReserveMobile) {
		this.bankReserveMobile = bankReserveMobile;
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

	public Area getBankProvince() {
		return bankProvince;
	}

	public void setBankProvince(Area bankProvince) {
		this.bankProvince = bankProvince;
	}

	public Area getBankCity() {
		return bankCity;
	}

	public void setBankCity(Area bankCity) {
		this.bankCity = bankCity;
	}

	public String getBankBranchName() {
		return bankBranchName;
	}

	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	@Override
	public String toString() {
		return "UserIdentity [userId=" + userId + ", customerId=" + customerId + ", realName=" + realName + ", gender="
				+ gender + ", identityNo=" + identityNo + ", mobile=" + mobile + ", debitCardNo=" + debitCardNo
				+ ", bankReserveMobile=" + bankReserveMobile + ", bankCode=" + bankCode + ", bankName=" + bankName
				+ ", bankProvince=" + bankProvince + ", bankCity=" + bankCity + ", bankBranchName=" + bankBranchName
				+ "]";
	}

	
	
}
