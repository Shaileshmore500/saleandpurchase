package Com.Entities;

import java.util.Date;




public class HO {

	private int ho_pid;
	private String name;
	private String address;
	private String PAN_no;
	private String GST_no;
	private Date creating_date;

	public HO() {
		// TODO Auto-generated constructor stub
	}

	public int getHo_pid() {
		return ho_pid;
	}

	public void setHo_pid(int ho_pid) {
		this.ho_pid = ho_pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPAN_no() {
		return PAN_no;
	}

	public void setPAN_no(String pAN_no) {
		PAN_no = pAN_no;
	}

	public String getGST_no() {
		return GST_no;
	}

	public void setGST_no(String gST_no) {
		GST_no = gST_no;
	}

	public Date getCreating_date() {
		return creating_date;
	}

	public void setCreating_date(Date creating_date) {
		this.creating_date = creating_date;
	}

	public HO(int ho_pid, String name, String address, String pAN_no, String gST_no, Date creating_date) {
		super();
		this.ho_pid = ho_pid;
		this.name = name;
		this.address = address;
		PAN_no = pAN_no;
		GST_no = gST_no;
		this.creating_date = creating_date;
	}

}
