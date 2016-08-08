package data;


/**
 * Created by Jacobow on 2016/6/15.
 * 商品信息, 多个所以单独定义
 */
public class Commodity implements java.io.Serializable {

    private static final long serialVersionUID = 1130378512422018336L;

    private Long id;

    private Long fid;               // 进件快照id

    private String sku;             // 商品的sku

    private String goodName;        // 商品的名称

    private String goodType;        // 商品的类型

    private String goodDescription; // 商品的描述

    private Integer downPaymentRatio = 0;   // 首付比例

    private String goodClass1;          // 商品一级品类

    private String goodClass2;          // 商品二级品类

    private String goodClass3;          // 商品三级品类

    private String goodBrand;       // 商品品牌

    public Commodity(String sku, String goodName, String goodType, String goodDescription, Integer downPaymentRatio) {
        setSku(sku);
        setGoodName(goodName);
        setGoodType(goodType);
        setGoodDescription(goodDescription);
        setDownPaymentRatio(downPaymentRatio);
    }

    public Commodity() {
        // nothing
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType;
    }

    public String getGoodDescription() {
        return goodDescription;
    }

    public void setGoodDescription(String goodDescription) {
        this.goodDescription = goodDescription;
    }

    public Integer getDownPaymentRatio() {
        return downPaymentRatio;
    }

    public void setDownPaymentRatio(Integer downPaymentRatio) {
        this.downPaymentRatio = downPaymentRatio;
    }

    public String getGoodClass1() {
        return goodClass1;
    }

    public void setGoodClass1(String goodClass1) {
        this.goodClass1 = goodClass1;
    }

    public String getGoodClass2() {
        return goodClass2;
    }

    public void setGoodClass2(String goodClass2) {
        this.goodClass2 = goodClass2;
    }

    public String getGoodClass3() {
        return goodClass3;
    }

    public void setGoodClass3(String goodClass3) {
        this.goodClass3 = goodClass3;
    }

    public String getGoodBrand() {
        return goodBrand;
    }

    public void setGoodBrand(String goodBrand) {
        this.goodBrand = goodBrand;
    }

	@Override
	public String toString() {
		return "Commodity [id=" + id + ", fid=" + fid + ", sku=" + sku + ", goodName=" + goodName + ", goodType="
				+ goodType + ", goodDescription=" + goodDescription + ", downPaymentRatio=" + downPaymentRatio
				+ ", goodClass1=" + goodClass1 + ", goodClass2=" + goodClass2 + ", goodClass3=" + goodClass3
				+ ", goodBrand=" + goodBrand + "]";
	}

    
}
