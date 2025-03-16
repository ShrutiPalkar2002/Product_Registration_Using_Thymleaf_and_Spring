package com.shruti.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ProductE {

	@Id
	@GeneratedValue
	private Integer pid;
	
	
	private String pname;
	
	private Double pprice;
	
	private Integer pquantity;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

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
		return "ProductE [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pquantity=" + pquantity + "]";
	}

	public void setPquantity(Integer pquantity) {
		this.pquantity = pquantity;
	}
	
	
	
}
