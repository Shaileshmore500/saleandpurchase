package Com.Entities;

import java.util.Date;




public class Product {

	private int product_pid;
	private String code;
	private String name;
	private String style;
	private float purchase_rate;
	private float MRP;
	private float Quantity;
	private float total_amount;
	
	private Brand brand_fid;
	
	private Category category_fid;
	
	private Suppiler supplier_fid;
	private String barcode;
	
	private PartyChallan PartyChallan_fid;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int product_pid, String code, String name, String style, float purchase_rate, float mRP,
			float quantity, float total_amount, Brand brand_fid, Category category_fid, Suppiler supplier_fid,
			String barcode, PartyChallan partyChallan_fid) {
		super();
		this.product_pid = product_pid;
		this.code = code;
		this.name = name;
		this.style = style;
		this.purchase_rate = purchase_rate;
		MRP = mRP;
		Quantity = quantity;
		this.total_amount = total_amount;
		this.brand_fid = brand_fid;
		this.category_fid = category_fid;
		this.supplier_fid = supplier_fid;
		this.barcode = barcode;
		PartyChallan_fid = partyChallan_fid;
	}

	public int getProduct_pid() {
		return product_pid;
	}

	public void setProduct_pid(int product_pid) {
		this.product_pid = product_pid;
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

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public float getPurchase_rate() {
		return purchase_rate;
	}

	public void setPurchase_rate(float purchase_rate) {
		this.purchase_rate = purchase_rate;
	}

	public float getMRP() {
		return MRP;
	}

	public void setMRP(float mRP) {
		MRP = mRP;
	}

	public float getQuantity() {
		return Quantity;
	}

	public void setQuantity(float quantity) {
		Quantity = quantity;
	}

	public float getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(float total_amount) {
		this.total_amount = total_amount;
	}

	public Brand getBrand_fid() {
		return brand_fid;
	}

	public void setBrand_fid(Brand brand_fid) {
		this.brand_fid = brand_fid;
	}

	public Category getCategory_fid() {
		return category_fid;
	}

	public void setCategory_fid(Category category_fid) {
		this.category_fid = category_fid;
	}

	public Suppiler getSupplier_fid() {
		return supplier_fid;
	}

	public void setSupplier_fid(Suppiler supplier_fid) {
		this.supplier_fid = supplier_fid;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public PartyChallan getPartyChallan_fid() {
		return PartyChallan_fid;
	}

	public void setPartyChallan_fid(PartyChallan partyChallan_fid) {
		PartyChallan_fid = partyChallan_fid;
	}
	

}
