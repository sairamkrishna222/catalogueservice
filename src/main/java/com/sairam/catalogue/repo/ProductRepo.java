package com.sairam.catalogue.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sairam.catalogue.entity.ProductMst;

@Repository
public interface ProductRepo extends JpaRepository<ProductMst, Long> {

}
