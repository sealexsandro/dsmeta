package com.sadev.dsmeta.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadev.dsmeta.entities.Sale;
import com.sadev.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository;

	public List<Sale> findSales() {
		return saleRepository.findAll();
	}
	
	
	
}
