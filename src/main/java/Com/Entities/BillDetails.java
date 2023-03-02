package Com.Entities;

public class BillDetails {

	private int billdetails_pid;
	private Float Quantity;
	private Float MRP;
	private Float TotalAmount;
	private Float DiscountRate;
	private Float DiscountAmount;
	private Float NetAmount;

	public int getBilldetails_pid() {
		return billdetails_pid;
	}

	public void setBilldetails_pid(int billdetails_pid) {
		this.billdetails_pid = billdetails_pid;
	}

	public Float getQuantity() {
		return Quantity;
	}

	public void setQuantity(Float quantity) {
		Quantity = quantity;
	}

	public Float getMRP() {
		return MRP;
	}

	public void setMRP(Float mRP) {
		MRP = mRP;
	}

	public Float getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		TotalAmount = totalAmount;
	}

	public Float getDiscountRate() {
		return DiscountRate;
	}

	public void setDiscountRate(Float discountRate) {
		DiscountRate = discountRate;
	}

	public Float getDiscountAmount() {
		return DiscountAmount;
	}

	public void setDiscountAmount(Float discountAmount) {
		DiscountAmount = discountAmount;
	}

	public Float getNetAmount() {
		return NetAmount;
	}

	public void setNetAmount(Float netAmount) {
		NetAmount = netAmount;
	}

	public BillDetails(int billdetails_pid, Float quantity, Float mRP, Float totalAmount, Float discountRate,
			Float discountAmount, Float netAmount) {
		super();
		this.billdetails_pid = billdetails_pid;
		Quantity = quantity;
		MRP = mRP;
		TotalAmount = totalAmount;
		DiscountRate = discountRate;
		DiscountAmount = discountAmount;
		NetAmount = netAmount;
	}

	public BillDetails() {
		// TODO Auto-generated constructor stub
	}

}
