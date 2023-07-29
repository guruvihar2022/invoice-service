package com.invoice.invoiceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InvoiceServiceApplication {

	public static void main(String[] args) {
		System.out.println("helloooo");
		SpringApplication.run(InvoiceServiceApplication.class, args); 
	}

}
