package com.boot.spring.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prodDetails")
//@Scope(value = "prototype")
public class ProductDetails {

	public ProductDetails() {
		System.out.println("ProductDetails constructor: default singleton");
	}

	private String pId;
	private String pName;

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public void showProduct() {
		System.out.println("Inside Product details show");
	}

}
