package com.sadev.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sadev.dsmeta.entities.Sale;
import com.sadev.dsmeta.servicies.SaleService;

@RestController
@RequestMapping("/sales")
public class SaleController {

	@Autowired
	private SaleService saleService;

	@GetMapping
	public List<Sale> findSales() {
		return saleService.findSales();
	}

//	@GetMapping
//	public ResponseEntity<List<Sale>> findSales() {
//		return ResponseEntity.ok().body(saleService.findSales());
//	}
}
