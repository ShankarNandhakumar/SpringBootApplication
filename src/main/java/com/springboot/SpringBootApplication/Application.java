package com.springboot.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
//		System.out.println("hello");
	Product p= context.getBean(Product.class);
		p.output();
//		Product p1=context.getBean(Product.class);
//		p1.output();	
	}

}
