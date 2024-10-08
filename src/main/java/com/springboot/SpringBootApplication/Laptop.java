package com.springboot.SpringBootApplication;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

	private int lapid;
	private String lapname;
	private String brand;
	private double price;
	public int getLapid() {
		return lapid;
	}
	public void setLapid(int lapid) {
		this.lapid = lapid;
	}
	public String getLapname() {
		return lapname;
	}
	public void setLapname(String lapname) {
		this.lapname = lapname;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [lapid=" + lapid + ", lapname=" + lapname + ", brand=" + brand + ", price=" + price + "]";
	}
	public void Purchase() {
		System.out.println("Product purchase ");
	}
}
