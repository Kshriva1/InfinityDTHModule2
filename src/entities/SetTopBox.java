package entities;

public class SetTopBox {
	
    public String STBType;
    public double STBlength;
    public double STBbreadth;
    public String[] STBFeatures;
    public double STBwidth;
    public double price;
    public double installationCharges;
    public double updationCharges;
    public int percentageDiscount;
    public String billingType;
    public double refundAmount;
    
	public String getSTBType() {
		return STBType;
	}
	public void setSTBType(String sTBType) {
		STBType = sTBType;
	}
	public double getSTBlength() {
		return STBlength;
	}
	public void setSTBlength(double sTBlength) {
		STBlength = sTBlength;
	}
	public double getSTBbreadth() {
		return STBbreadth;
	}
	public void setSTBbreadth(double sTBbreadth) {
		STBbreadth = sTBbreadth;
	}
	public double getSTBwidth() {
		return STBwidth;
	}
	public void setSTBwidth(double sTBwidth) {
		STBwidth = sTBwidth;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getInstallationCharges() {
		return installationCharges;
	}
	public void setInstallationCharges(double installationCharges) {
		this.installationCharges = installationCharges;
	}
	public double getUpdationCharges() {
		return updationCharges;
	}
	public void setUpdationCharges(double updationCharges) {
		this.updationCharges = updationCharges;
	}
	public int getPercentageDiscount() {
		return percentageDiscount;
	}
	public void setPercentageDiscount(int percentageDiscount) {
		this.percentageDiscount = percentageDiscount;
	}
	public String getBillingType() {
		return billingType;
	}
	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}
	public double getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(double refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String[] getSTBFeatures() {
		return STBFeatures;
	}
	public void setSTBFeatures(String[] sTBFeatures) {
		STBFeatures = sTBFeatures;
	}
}
