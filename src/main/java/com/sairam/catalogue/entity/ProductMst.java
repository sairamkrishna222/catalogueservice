package com.sairam.catalogue.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;


@Entity
@Table(name = "product_mst")
public class ProductMst {

	@Column(name = "prd_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private long productId;
  
	@NotNull
  @Column(name = "prd_name")
  private String productName;
  
	
  @Column(name = "prd_seller")
  private String productSeller;
  
	@NotNull
  @Column(name = "prd_mfg_date")
  private String productMfgDate;
  
	@NotNull
  @Column(name = "prd_price")
  private double productPrice;
  	
  @Column(name="valid_to")
  private int validupto;
	
	@NotNull
  @Column(name = "created_date")
  private Date createdDate;
  
  @ManyToOne(fetch = FetchType.EAGER,targetEntity = CatalogueMst.class)
  @JoinColumn(name="catt_id")
  private CatalogueMst catalogueId;
  
  public ProductMst() {
	  
  }

public ProductMst(long productId, String productName, String productSeller, String productMfgDate, double productPrice,
		int validupto, Date createdDate, CatalogueMst catalogueId) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productSeller = productSeller;
	this.productMfgDate = productMfgDate;
	this.productPrice = productPrice;
	this.validupto = validupto;
	this.createdDate = createdDate;
	this.catalogueId = catalogueId;
}

public long getProductId() {
	return productId;
}

public void setProductId(long productId) {
	this.productId = productId;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public String getProductSeller() {
	return productSeller;
}

public void setProductSeller(String productSeller) {
	this.productSeller = productSeller;
}

public String getProductMfgDate() {
	return productMfgDate;
}

public void setProductMfgDate(String productMfgDate) {
	this.productMfgDate = productMfgDate;
}

public double getProductPrice() {
	return productPrice;
}

public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}

public int getValidupto() {
	return validupto;
}

public void setValidupto(int validupto) {
	this.validupto = validupto;
}

public Date getCreatedDate() {
	return createdDate;
}

public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}

public CatalogueMst getCatalogueId() {
	return catalogueId;
}

public void setCatalogueId(CatalogueMst catalogueId) {
	this.catalogueId = catalogueId;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((catalogueId == null) ? 0 : catalogueId.hashCode());
	result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
	result = prime * result + (int) (productId ^ (productId >>> 32));
	result = prime * result + ((productMfgDate == null) ? 0 : productMfgDate.hashCode());
	result = prime * result + ((productName == null) ? 0 : productName.hashCode());
	long temp;
	temp = Double.doubleToLongBits(productPrice);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((productSeller == null) ? 0 : productSeller.hashCode());
	result = prime * result + validupto;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ProductMst other = (ProductMst) obj;
	if (catalogueId == null) {
		if (other.catalogueId != null)
			return false;
	} else if (!catalogueId.equals(other.catalogueId))
		return false;
	if (createdDate == null) {
		if (other.createdDate != null)
			return false;
	} else if (!createdDate.equals(other.createdDate))
		return false;
	if (productId != other.productId)
		return false;
	if (productMfgDate == null) {
		if (other.productMfgDate != null)
			return false;
	} else if (!productMfgDate.equals(other.productMfgDate))
		return false;
	if (productName == null) {
		if (other.productName != null)
			return false;
	} else if (!productName.equals(other.productName))
		return false;
	if (Double.doubleToLongBits(productPrice) != Double.doubleToLongBits(other.productPrice))
		return false;
	if (productSeller == null) {
		if (other.productSeller != null)
			return false;
	} else if (!productSeller.equals(other.productSeller))
		return false;
	if (validupto != other.validupto)
		return false;
	return true;
}

@Override
public String toString() {
	return "ProductMst [productId=" + productId + ", productName=" + productName + ", productSeller=" + productSeller
			+ ", productMfgDate=" + productMfgDate + ", productPrice=" + productPrice + ", validupto=" + validupto
			+ ", createdDate=" + createdDate + ", catalogueId=" + catalogueId + "]";
}
  
  
  
  
  
}
