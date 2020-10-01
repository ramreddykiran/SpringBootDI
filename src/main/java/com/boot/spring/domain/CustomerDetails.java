package com.boot.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerDetails {
	private String customerId;
	private String customerName;
	
	@Autowired
	@Qualifier("prodDetails")
	private ProductDetails productDetails;
	
	public CustomerDetails() {
		System.out.println("CustomerDetails constructor");
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public ProductDetails getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(ProductDetails productDetails) {
		this.productDetails = productDetails;
	}
	
	public void showCustomer() {
		System.out.println("Inside CustomerDetails show");
		productDetails.showProduct();
	}

}
