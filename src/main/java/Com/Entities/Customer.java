package Com.Entities;

import java.util.Date;

public class Customer {

	private int customer_pid;
	private String name;
	private String mobileNo;
	private String address;
	private Date DOB;

	public int getCustomer_pid() {
		return customer_pid;
	}

	public void setCustomer_pid(int customer_pid) {
		this.customer_pid = customer_pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public Customer(int customer_pid, String name, String mobileNo, String address, Date dOB) {
		super();
		this.customer_pid = customer_pid;
		this.name = name;
		this.mobileNo = mobileNo;
		this.address = address;
		DOB = dOB;
	}

	public Customer() {

		// TODO Auto-generated constructor stub
	}

}
