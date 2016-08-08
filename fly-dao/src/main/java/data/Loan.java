package data;


/**
 * Created by Jacobow on 2016/6/15.
 * 提交的贷款数据
 */
public class Loan implements java.io.Serializable {

    private static final long serialVersionUID = 3746976835530598358L;

    private Long fid;
    private String cityCode;                        // 所在城市
    private String financeCode;                     // 贷款产品
    private String eventCode;                       // 活动编码
    private String goodsAmount;                     // 商品总金额
    private String downPaymentRatio;                // 首付比例
    private String downPaymentAmount;               // 首付金额
    private String loanAmount;                      // 实际贷款金额
    private String monthRepayAmount;                // 每月还款金额
    private Integer term;                           // 分期数
    private String paymentBag;                      // 还款包

    public Loan(Long fid, String cityCode, String financeCode, String eventCode, String goodsAmount, String downPaymentRatio,
                String downPaymentAmount, String loanAmount, String monthRepayAmount, Integer term, String paymentBag) {
        this(cityCode, financeCode, eventCode, goodsAmount, downPaymentRatio, downPaymentAmount, loanAmount, monthRepayAmount, term, paymentBag);
        setFid(fid);
    }

    public Loan(String cityCode, String financeCode, String eventCode, String goodsAmount, String downPaymentRatio,
                String downPaymentAmount, String loanAmount, String monthRepayAmount, Integer term, String paymentBag) {
        setCityCode(cityCode);
        setFinanceCode(financeCode);
        setEventCode(eventCode);
        setGoodsAmount(goodsAmount);
        setDownPaymentRatio(downPaymentRatio);
        setDownPaymentAmount(downPaymentAmount);
        setLoanAmount(loanAmount);
        setMonthRepayAmount(monthRepayAmount);
        setTerm(term);
        setPaymentBag(paymentBag);
    }

    public Loan() {
        //
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getFinanceCode() {
        return financeCode;
    }

    public void setFinanceCode(String financeCode) {
        this.financeCode = financeCode;
    }

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public String getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(String goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public String getDownPaymentRatio() {
        return downPaymentRatio;
    }

    public void setDownPaymentRatio(String downPaymentRatio) {
        this.downPaymentRatio = downPaymentRatio;
    }

    public String getDownPaymentAmount() {
        return downPaymentAmount;
    }

    public void setDownPaymentAmount(String downPaymentAmount) {
        this.downPaymentAmount = downPaymentAmount;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getMonthRepayAmount() {
        return monthRepayAmount;
    }

    public void setMonthRepayAmount(String monthRepayAmount) {
        this.monthRepayAmount = monthRepayAmount;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public String getPaymentBag() {
        return paymentBag;
    }

    public void setPaymentBag(String paymentBag) {
        this.paymentBag = paymentBag;
    }

	@Override
	public String toString() {
		return "Loan [fid=" + fid + ", cityCode=" + cityCode + ", financeCode=" + financeCode + ", eventCode="
				+ eventCode + ", goodsAmount=" + goodsAmount + ", downPaymentRatio=" + downPaymentRatio
				+ ", downPaymentAmount=" + downPaymentAmount + ", loanAmount=" + loanAmount + ", monthRepayAmount="
				+ monthRepayAmount + ", term=" + term + ", paymentBag=" + paymentBag + "]";
	}



}
