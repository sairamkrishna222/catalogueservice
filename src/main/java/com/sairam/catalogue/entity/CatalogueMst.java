package com.sairam.catalogue.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="catalogue_mst")
public class CatalogueMst {

	@Column(name="cat_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long catId;
	
	@Column(name="cat_name")
	private String catName;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="created_by")
	private int createdBy;
	
	
	@Column(name="cat_code")
	private String catCode;
	
	@Column(name="is_active")
	private int isActive;

	public long getCatId() {
		return catId;
	}

	public void setCatId(long catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public String getCatCode() {
		return catCode;
	}

	public void setCatCode(String catCode) {
		this.catCode = catCode;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public CatalogueMst(long catId, String catName, Date createdDate, int createdBy, String catCode, int isActive) {
		super();
		this.catId = catId;
		this.catName = catName;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.catCode = catCode;
		this.isActive = isActive;
	}
	
	public CatalogueMst()
	{
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((catCode == null) ? 0 : catCode.hashCode());
		result = prime * result + (int) (catId ^ (catId >>> 32));
		result = prime * result + ((catName == null) ? 0 : catName.hashCode());
		result = prime * result + createdBy;
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + isActive;
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
		CatalogueMst other = (CatalogueMst) obj;
		if (catCode == null) {
			if (other.catCode != null)
				return false;
		} else if (!catCode.equals(other.catCode))
			return false;
		if (catId != other.catId)
			return false;
		if (catName == null) {
			if (other.catName != null)
				return false;
		} else if (!catName.equals(other.catName))
			return false;
		if (createdBy != other.createdBy)
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (isActive != other.isActive)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CatalogueMst [catId=" + catId + ", catName=" + catName + ", createdDate=" + createdDate + ", createdBy="
				+ createdBy + ", catCode=" + catCode + ", isActive=" + isActive + "]";
	}
	
	
}
