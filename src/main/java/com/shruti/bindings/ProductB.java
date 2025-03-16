package com.shruti.bindings;



import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProductB {

	@Size(min = 3, max = 50, message = "Product name must be between 3 and 50 characters!")
	private String pname;

	
    @NotNull(message = "Price must not be null!")
    @Min(value = 1, message = "Price must be greater than 0!")
	private Double pprice;
	
	@jakarta.validation.constraints.NotNull(message = "Quantity cannot be null!")
	
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
