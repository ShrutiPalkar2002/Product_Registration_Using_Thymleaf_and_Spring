package com.shruti.bindings;

public class ProductB {

	private String pname;
	
	private Double pprice;
	
	private Integer pquantity;



	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPprice() {
		return pprice;
	}

	public void setPprice(Double pprice) {
		this.pprice = pprice;
	}

	public Integer getPquantity() {
		return pquantity;
	}

	@Override
	public String toString() {
		return "ProductE [pname=" + pname + ", pprice=" + pprice + ", pquantity=" + pquantity + "]";
	}

	public void setPquantity(Integer pquantity) {
		this.pquantity = pquantity;
	}
}
