package com.invoice.invoiceservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoice.invoiceservice.entity.InvoiceEntity;
import com.invoice.invoiceservice.pojo.InvoiceVO;
import com.invoice.invoiceservice.repository.InvoiceRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class InvoiceService {
	
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	public InvoiceEntity createInvoice(InvoiceEntity vo) {
		return invoiceRepository.save(vo);
	}

	public InvoiceVO getInvoiceDetails(int invoiceId) {
		InvoiceEntity entity = new InvoiceEntity();
		InvoiceVO vo = new InvoiceVO();
		entity =invoiceRepository.findById(invoiceId).orElse(entity);
		vo.setInvoiceBy(entity.getInvoiceBy());
		vo.setInvoiceDate(entity.getInvoiceDate());
		vo.setInvoiceNo(entity.getInvoiceNo());
		return vo;
	}

}
