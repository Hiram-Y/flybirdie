package data;


/**
 * Created by Jacobow on 2016/6/24.
 * 销管信息
 */
public class SaleControl implements java.io.Serializable {

    private static final long serialVersionUID = 1222929613678803576L;

    private Long fid;
    private String customerApplyCode;       // 客户申请编码
    private String storeCode;               // 芝麻评分
    private String saleNo;                  // 销售代码
    private String riskLevel;               // 风险等级
    private String personNo;                // 销售人员id
    private String userCode;                // 推广人员编码
    private String gpsAddress;              // GPS
    private String gpsCity;                 // GPS城市
    private String macAddress;              // 设备指纹
    private String sesameLevel;             // 芝麻信用
    private String sesameLevelImg;          // 芝麻信用图片地址
    private String deviceIpAddress;         // 设备IP地址
    private String createDate;              // 创建时间

    private String storeProvinceCode;       // 门店省
    private String storeCityCode;           // 门店市
    private String storeZoneCode;           // 门店县区
    private String storeDetailedAddress;    // 门店详细地址
    private String storeLocation;           // 门店gps


    public SaleControl(Long fid, String customerApplyCode, String storeCode, String saleNo, String riskLevel, String personNo, String userCode,
                       String gpsAddress, String gpsCity, String macAddress, String sesameLevel, String sesameLevelImg, String deviceIpAddress,
                       String createDate, String storeProvinceCode, String storeCityCode, String storeZoneCode, String storeDetailedAddress, String storeLocation) {
        this(customerApplyCode, storeCode, saleNo, riskLevel, personNo, userCode, gpsAddress, gpsCity, macAddress, sesameLevel, sesameLevelImg, deviceIpAddress,
                createDate, storeProvinceCode, storeCityCode, storeZoneCode, storeDetailedAddress, storeLocation);
        setFid(fid);
    }

    public SaleControl(String customerApplyCode, String storeCode, String saleNo, String riskLevel, String personNo, String userCode,
                       String gpsAddress, String gpsCity, String macAddress, String sesameLevel, String sesameLevelImg, String deviceIpAddress,
                       String createDate, String storeProvinceCode, String storeCityCode, String storeZoneCode, String storeDetailedAddress, String storeLocation) {
        setCustomerApplyCode(customerApplyCode);
        setStoreCode(storeCode);
        setSaleNo(saleNo);
        setRiskLevel(riskLevel);
        setPersonNo(personNo);
        setUserCode(userCode);
        setGpsAddress(gpsAddress);
        setGpsCity(gpsCity);
        setMacAddress(macAddress);
        setSesameLevel(sesameLevel);
        setSesameLevelImg(sesameLevelImg);
        setDeviceIpAddress(deviceIpAddress);
        setCreateDate(createDate);
        setStoreProvinceCode(storeProvinceCode);
        setStoreCityCode(storeCityCode);
        setStoreZoneCode(storeZoneCode);
        setStoreDetailedAddress(storeDetailedAddress);
        setStoreLocation(storeLocation);
    }

    public SaleControl() {
        //
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getCustomerApplyCode() {
        return customerApplyCode;
    }

    public void setCustomerApplyCode(String customerApplyCode) {
        this.customerApplyCode = customerApplyCode;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(String saleNo) {
        this.saleNo = saleNo;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getPersonNo() {
        return personNo;
    }

    public void setPersonNo(String personNo) {
        this.personNo = personNo;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getGpsAddress() {
        return gpsAddress;
    }

    public void setGpsAddress(String gpsAddress) {
        this.gpsAddress = gpsAddress;
    }

    public String getGpsCity() {
        return gpsCity;
    }

    public void setGpsCity(String gpsCity) {
        this.gpsCity = gpsCity;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getSesameLevel() {
        return sesameLevel;
    }

    public void setSesameLevel(String sesameLevel) {
        this.sesameLevel = sesameLevel;
    }

    public String getSesameLevelImg() {
        return sesameLevelImg;
    }

    public void setSesameLevelImg(String sesameLevelImg) {
        this.sesameLevelImg = sesameLevelImg;
    }

    public String getDeviceIpAddress() {
        return deviceIpAddress;
    }

    public void setDeviceIpAddress(String deviceIpAddress) {
        this.deviceIpAddress = deviceIpAddress;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getStoreProvinceCode() {
        return storeProvinceCode;
    }

    public void setStoreProvinceCode(String storeProvinceCode) {
        this.storeProvinceCode = storeProvinceCode;
    }

    public String getStoreCityCode() {
        return storeCityCode;
    }

    public void setStoreCityCode(String storeCityCode) {
        this.storeCityCode = storeCityCode;
    }

    public String getStoreZoneCode() {
        return storeZoneCode;
    }

    public void setStoreZoneCode(String storeZoneCode) {
        this.storeZoneCode = storeZoneCode;
    }

    public String getStoreDetailedAddress() {
        return storeDetailedAddress;
    }

    public void setStoreDetailedAddress(String storeDetailedAddress) {
        this.storeDetailedAddress = storeDetailedAddress;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

	@Override
	public String toString() {
		return "SaleControl [fid=" + fid + ", customerApplyCode=" + customerApplyCode + ", storeCode=" + storeCode
				+ ", saleNo=" + saleNo + ", riskLevel=" + riskLevel + ", personNo=" + personNo + ", userCode="
				+ userCode + ", gpsAddress=" + gpsAddress + ", gpsCity=" + gpsCity + ", macAddress=" + macAddress
				+ ", sesameLevel=" + sesameLevel + ", sesameLevelImg=" + sesameLevelImg + ", deviceIpAddress="
				+ deviceIpAddress + ", createDate=" + createDate + ", storeProvinceCode=" + storeProvinceCode
				+ ", storeCityCode=" + storeCityCode + ", storeZoneCode=" + storeZoneCode + ", storeDetailedAddress="
				+ storeDetailedAddress + ", storeLocation=" + storeLocation + "]";
	}

    
}
