package com.boot.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.spring.domain.CustomerDetails;
import com.boot.spring.domain.ProductDetails;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		ProductDetails productDetails = context.getBean(ProductDetails.class);
		
		productDetails.showProduct();
		
		/*
		 * ProductDetails productDetails2 = context.getBean(ProductDetails.class);
		 * 
		 * productDetails2.showProduct();
		 */
		
		CustomerDetails customerDetails = context.getBean(CustomerDetails.class);
		customerDetails.showCustomer();
	}
	
	

}
