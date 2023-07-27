package com.invoice.invoiceservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invoice.invoiceservice.entity.InvoiceEntity;
import com.invoice.invoiceservice.pojo.InvoiceVO;
import com.invoice.invoiceservice.service.InvoiceService;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
	
	@Autowired
	private InvoiceService invoiceService;
	
	@RequestMapping("/")
	public String helloMessage() {
		return "hello";
	}
	
	@PostMapping("/")
	public InvoiceEntity createInvoice(@RequestBody InvoiceVO vo) {
		InvoiceEntity entity = new InvoiceEntity();
		convertVOToEntity(vo,entity);
		return invoiceService.createInvoice(entity);
	}
	
	@GetMapping("invoicedetails/{invoiceNo}")
	public InvoiceVO getInvoiceDetails(@PathVariable int invoiceNo) {
		return invoiceService.getInvoiceDetails(invoiceNo);
		
	}
	
	private void convertVOToEntity(InvoiceVO vo,InvoiceEntity entity) {
		entity.setInvoiceBy(vo.getInvoiceBy());
		entity.setInvoiceDate(vo.getInvoiceDate());
	}

}