package Com.Entities;




public class Brand {
	
	private int brand_pid;
	private String name;
	private String code;
	
	
	

	public Brand() {
		// TODO Auto-generated constructor stub
	}




	public Brand(int brand_pid, String name, String code) {
		super();
		this.brand_pid = brand_pid;
		this.name = name;
		this.code = code;
	}




	public int getBrand_pid() {
		return brand_pid;
	}




	public void setBrand_pid(int brand_pid) {
		this.brand_pid = brand_pid;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getCode() {
		return code;
	}




	public void setCode(String code) {
		this.code = code;
	}



	

}
