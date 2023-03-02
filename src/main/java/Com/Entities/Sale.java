package Com.Entities;

import java.util.Date;

public class Sale {

	private int sale_pid;
	private long bill_no;
	private float amount;
	private float Quantity;
	private Date date;
	private float discount_amount;
	private float discount_rate;
	private float net_amount;
	private Customer customer_fid;
	private User user_fid;

	public int getSale_pid() {
		return sale_pid;
	}

	public void setSale_pid(int sale_pid) {
		this.sale_pid = sale_pid;
	}

	public long getBill_no() {
		return bill_no;
	}

	public void setBill_no(long bill_no) {
		this.bill_no = bill_no;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getDiscount_amount() {
		return discount_amount;
	}

	public void setDiscount_amount(float discount_amount) {
		this.discount_amount = discount_amount;
	}

	public float getDiscount_rate() {
		return discount_rate;
	}

	public void setDiscount_rate(float discount_rate) {
		this.discount_rate = discount_rate;
	}

	public float getNet_amount() {
		return net_amount;
	}

	public void setNet_amount(float net_amount) {
		this.net_amount = net_amount;
	}

	public Customer getCustomer_fid() {
		return customer_fid;
	}

	public void setCustomer_fid(Customer customer_fid) {
		this.customer_fid = customer_fid;
	}

	public User getUser_fid() {
		return user_fid;
	}

	public void setUser_fid(User user_fid) {
		this.user_fid = user_fid;
	}

	public Sale(int sale_pid, long bill_no, float amount, float quantity, Date date, float discount_amount,
			float discount_rate, float net_amount, Customer customer_fid, User user_fid) {
		super();
		this.sale_pid = sale_pid;
		this.bill_no = bill_no;
		this.amount = amount;
		Quantity = quantity;
		this.date = date;
		this.discount_amount = discount_amount;
		this.discount_rate = discount_rate;
		this.net_amount = net_amount;
		this.customer_fid = customer_fid;
		this.user_fid = user_fid;
	}

	public Sale() {
		// TODO Auto-generated constructor stub
	}

}
