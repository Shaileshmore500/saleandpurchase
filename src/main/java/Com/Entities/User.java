package Com.Entities;

import java.util.Date;

public class User {

	private int user_pid;
	private String code;
	private String name;
	private String password;
	private Date DOB;

	private Designation designation_fid;
	private String address;
	private Date dateofjoining;

	private Branch branch;

	public int getUser_pid() {
		return user_pid;
	}

	public void setUser_pid(int user_pid) {
		this.user_pid = user_pid;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public Designation getDesignation_fid() {
		return designation_fid;
	}

	public void setDesignation_fid(Designation designation_fid) {
		this.designation_fid = designation_fid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateofjoining() {
		return dateofjoining;
	}

	public void setDateofjoining(Date dateofjoining) {
		this.dateofjoining = dateofjoining;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public User(int user_pid, String code, String name, String password, Date dOB, Designation designation_fid,
			String address, Date dateofjoining, Branch branch) {
		super();
		this.user_pid = user_pid;
		this.code = code;
		this.name = name;
		this.password = password;
		DOB = dOB;
		this.designation_fid = designation_fid;
		this.address = address;
		this.dateofjoining = dateofjoining;
		this.branch = branch;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

}
