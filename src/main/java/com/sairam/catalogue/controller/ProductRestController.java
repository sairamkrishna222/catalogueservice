package com.sairam.catalogue.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sairam.catalogue.entity.ProductMst;
import com.sairam.catalogue.service.ProductService;

@RestController
@RequestMapping("/catalogue")
public class ProductRestController {

	@Autowired
	private ProductService productServ;
	
	
	@GetMapping("/all")
	public ResponseEntity<List<ProductMst>>  getAllProducts()
	{
	 List<ProductMst> mylist=  productServ.getAllProductList();
				//.stream().map(s->s.getProductName()).collect(Collectors.toList());
		return new ResponseEntity<>(mylist, HttpStatus.OK);
		
	}
}
