package com.springboot.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Product {

	private int prductid;
	private String productname;
	private double price;
	@Autowired
	private Laptop laptop;
	
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Product() {
		super();
		System.out.println("object created");
	}
	public int getPrductid() {
		return prductid;
	}
	public void setPrductid(int prductid) {
		this.prductid = prductid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public void output() {
		System.out.println("Output printed sucessfully");
		laptop.Purchase();
	}
}
