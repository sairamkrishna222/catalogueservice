package com.sairam.catalogue.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sairam.catalogue.entity.ProductMst;
import com.sairam.catalogue.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo repo;
	
	
	public List<ProductMst> getAllProductList()
	{
		
		List<ProductMst> mylist = (ArrayList<ProductMst>) repo.findAll();
		
		return mylist ;
		
	}
	
	
	
}
