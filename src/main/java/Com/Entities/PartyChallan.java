package Com.Entities;

import java.util.Date;




public class PartyChallan
{
	
	
	private int PartyChallan_pid;
	private float amount;
	private float Quantity;
	private Date challan_date;
	
	private Suppiler supplier_fid;
	
	
	private Branch branch_fid;
	private Date purchase_date;
	public int getPartyChallan_pid() {
		return PartyChallan_pid;
	}
	public void setPartyChallan_pid(int partyChallan_pid) {
		PartyChallan_pid = partyChallan_pid;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float getQuantity() {
		return Quantity;
	}
	public void setQuantity(float quantity) {
		Quantity = quantity;
	}
	public Date getChallan_date() {
		return challan_date;
	}
	public void setChallan_date(Date challan_date) {
		this.challan_date = challan_date;
	}
	public Suppiler getSupplier_fid() {
		return supplier_fid;
	}
	public void setSupplier_fid(Suppiler supplier_fid) {
		this.supplier_fid = supplier_fid;
	}
	public Branch getBranch_fid() {
		return branch_fid;
	}
	public void setBranch_fid(Branch branch_fid) {
		this.branch_fid = branch_fid;
	}
	public Date getPurchase_date() {
		return purchase_date;
	}
	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}
	public PartyChallan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PartyChallan(int partyChallan_pid, float amount, float quantity, Date challan_date, Suppiler supplier_fid,
			Branch branch_fid, Date purchase_date) {
		super();
		PartyChallan_pid = partyChallan_pid;
		this.amount = amount;
		Quantity = quantity;
		this.challan_date = challan_date;
		this.supplier_fid = supplier_fid;
		this.branch_fid = branch_fid;
		this.purchase_date = purchase_date;
	}
	
	
	
	
}
