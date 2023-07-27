package com.invoice.invoiceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invoice.invoiceservice.entity.InvoiceEntity;

public interface InvoiceRepository extends JpaRepository<InvoiceEntity, Integer>{

}
