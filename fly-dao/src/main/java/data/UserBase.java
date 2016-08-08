package data;


/**
 * Created by Jacobow on 2016/6/16.
 *
 */
public class UserBase implements java.io.Serializable {

    private static final long serialVersionUID = 8693409695645078520L;

    private Long fid;
    private String education;                       // 学历
    private String jobNature;                       // 工资性质
    private String companyName;                     // 公司名称
    private String companyPhone;                    // 公司电话
    private String residentialProvinceCode;         // 居住地址
    private String residentialCityCode;             // 居住地址
    private String residentialZoneCode;             // 居住地址
    private String residentialAddress;              // 居住地址 类似 北京-北京市-朝阳区  河北省-张家口市-张北县
    private String detailedAddress;                 // 详细地址
    private String residentialState;                // 住房状况
    private String marriageState;                   // 婚姻状态
    private String email;                           // 电子邮箱地址
    private String creditCardNo;                    // 信用卡卡号

    public UserBase(Long fid, String education, String jobNature, String companyName, String companyPhone,
                    String residentialProvinceCode, String residentialCityCode, String residentialZoneCode, String residentialAddress,
                    String detailedAddress, String residentialState, String marriageState, String email, String creditCardNo) {
        setFid(fid);
        setEducation(education);
        setJobNature(jobNature);
        setCompanyName(companyName);
        setCompanyPhone(companyPhone);
        setResidentialProvinceCode(residentialProvinceCode);
        setResidentialCityCode(residentialCityCode);
        setResidentialZoneCode(residentialZoneCode);
        setResidentialAddress(residentialAddress);
        setDetailedAddress(detailedAddress);
        setResidentialState(residentialState);
        setMarriageState(marriageState);
        setEmail(email);
        setCreditCardNo(creditCardNo);
    }

    public UserBase() {
        //
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getJobNature() {
        return jobNature;
    }

    public void setJobNature(String jobNature) {
        this.jobNature = jobNature;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getResidentialProvinceCode() {
        return residentialProvinceCode;
    }

    public void setResidentialProvinceCode(String residentialProvinceCode) {
        this.residentialProvinceCode = residentialProvinceCode;
    }

    public String getResidentialCityCode() {
        return residentialCityCode;
    }

    public void setResidentialCityCode(String residentialCityCode) {
        this.residentialCityCode = residentialCityCode;
    }


    public String getResidentialZoneCode() {
        return residentialZoneCode;
    }

    public void setResidentialZoneCode(String residentialZoneCode) {
        this.residentialZoneCode = residentialZoneCode;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getResidentialState() {
        return residentialState;
    }

    public void setResidentialState(String residentialState) {
        this.residentialState = residentialState;
    }

    public String getMarriageState() {
        return marriageState;
    }

    public void setMarriageState(String marriageState) {
        this.marriageState = marriageState;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

	@Override
	public String toString() {
		return "UserBase [fid=" + fid + ", education=" + education + ", jobNature=" + jobNature + ", companyName="
				+ companyName + ", companyPhone=" + companyPhone + ", residentialProvinceCode="
				+ residentialProvinceCode + ", residentialCityCode=" + residentialCityCode + ", residentialZoneCode="
				+ residentialZoneCode + ", residentialAddress=" + residentialAddress + ", detailedAddress="
				+ detailedAddress + ", residentialState=" + residentialState + ", marriageState=" + marriageState
				+ ", email=" + email + ", creditCardNo=" + creditCardNo + "]";
	}

   
}
